public class Assignment_operator {
    public static void main(String[] args) {

        int a = 10;       // Simple assignment: a = 10
        int b = 5;        // Simple assignment: b = 5
        
        // Compound assignment operators
        a += 5;  // a = a + 5 → a = 15
        b *= 2;  // b = b * 2 → b = 10
        
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // More examples
        int x = 20;   // x = 20
        x -= 10;      // x = x - 10 → x = 10
        x /= 2;       // x = x / 2 → x = 5
        x %= 3;       // x = x % 3 → remainder when 5 divided by 3 = 2

        System.out.println("Final value of x: " + x);
    }
}
