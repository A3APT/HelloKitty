import java.io.File;
import java.io.IOException;

public class NewKitty {
    public static void main(String[] args) {
        // Get the desktop path
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";

        // Create folder on desktop
        File folder = new File(desktopPath, "HelloKittyFolder");
        if (!folder.exists()) {
            boolean created = folder.mkdir();
            if (created) {
                System.out.println("Folder 'HelloKittyFolder' created on Desktop.");
            } else {
                System.out.println("Failed to create folder on Desktop.");
            }
        } else {
            System.out.println("Folder already exists on Desktop.");
        }

        // Create file inside the folder on desktop
        File file = new File(folder, "hello kitty.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File 'hello kitty.txt' created inside 'HelloKittyFolder' on Desktop.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating the file.");
            e.printStackTrace();
        }
    }
}
