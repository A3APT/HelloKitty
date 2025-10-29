import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        if (name.equals("xxx")) {
            System.out.println("🙄😠 G4rbl3d m3ss4g3! You broke it! 😡🤬");
        } else {
            String reversedName = new StringBuilder(name).reverse().toString();
            System.out.println("Your name reversed is: " + reversedName);

            NewKitty newKitty = new NewKitty();
            newKitty.createOrRenameFolder(name);
        }

        scanner.close();
    }
}
