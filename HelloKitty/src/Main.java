import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Did you know that if you reverse your name it sounds like '" + new StringBuilder(name).reverse().toString() + "'? Fun, right?");
        
        scanner.close();
    }
}