import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter single word: ");
        String input = sc.next();     // Reads one word

        sc.nextLine(); // <-- consume leftover newline here!

        System.out.print("Enter full name: ");
        String name = sc.nextLine();  // Reads full line (works properly now)

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter price: ");
        float price = sc.nextFloat();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Input: " + input);
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
    }
}
