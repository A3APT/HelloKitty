import java.io.File;
import java.io.IOException;

public class NewKitty {

    private File folder;
    private final String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";

    public void createOrRenameFolder(String folderName) {
        // Define folder with requested name
        File newFolder = new File(desktopPath, folderName);

        // Check if a folder with a different name exists, rename it
        if (folder != null && folder.exists() && !folder.getName().equals(folderName)) {
            boolean renamed = folder.renameTo(newFolder);
            if (renamed) {
                System.out.println("Folder renamed to: " + folderName);
            } else {
                System.out.println("Failed to rename the folder.");
            }
        }

        // If folder doesn't exist, create it
        if (!newFolder.exists()) {
            boolean created = newFolder.mkdir();
            if (created) {
                System.out.println("Folder '" + folderName + "' created on Desktop.");
            } else {
                System.out.println("Failed to create folder '" + folderName + "'.");
            }
        } else {
            System.out.println("Folder '" + folderName + "' already exists.");
        }

        folder = newFolder;

        createFileInFolder();
    }

    private void createFileInFolder() {
        if (folder == null) {
            System.out.println("Folder not set. Cannot create file.");
            return;
        }

        File file = new File(folder, "hello kitty.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File 'hello kitty.txt' created inside folder '" + folder.getName() + "'.");
            } else {
                System.out.println("File 'hello kitty.txt' already exists inside folder '" + folder.getName() + "'.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating the file.");
            e.printStackTrace();
        }
    }
}
