public class String_Compare {
    public static void main(String[] args) {
        // String literals
        String s1 = "Tonny";
        String s2 = "Tonny";

        // String object using new keyword
        String s3 = new String("Tonny");

        // Comparing string literals using '=='
        if (s1 == s2) {
            System.out.println("s1 and s2 using '==' : Strings are equal");
        } else {
            System.out.println("s1 and s2 using '==' : Strings are not equal");
        }

        // Comparing string literal and string object using '=='
        if (s1 == s3) {
            System.out.println("s1 and s3 using '==' : Strings are equal");
        } else {
            System.out.println("s1 and s3 using '==' : Strings are not equal");
        }

        // Comparing strings using .equals() method
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 using '.equals()' : Strings are equal");
        } else {
            System.out.println("s1 and s3 using '.equals()' : Strings are not equal");
        }
    }
}
