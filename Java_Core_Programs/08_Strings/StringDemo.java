import java.util.*;

public class StringDemo {
    public static void main(String[] args) {

        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are immutable

        // For Taking input
        Scanner sc = new Scanner(System.in);

        String name;
        name = sc.next();
        System.out.println(name);

        String name1;
        name1 = sc.next();   // FIXED
        System.out.println(name1);

        // length() function
        System.out.println(name1.length());

        // String Concatenation
        String firstName = "Shradha";
        String lastName = "Kapoor";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.charAt(5));
    }
}
