public class Day_0004_Tribonacci_1137 {

    public static int tribonacci(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        // Initial values
        int first_num = 0;   // T0
        int second_num = 1;  // T1
        int third_num = 1;   // T2

        // Loop from 3 to n
        for (int i = 3; i <= n; i++) {
            int fourth_num = first_num + second_num + third_num;

            first_num = second_num;
            second_num = third_num;
            third_num = fourth_num;
        }

        return third_num; // Tn
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Tribonacci of " + n + " is: " + tribonacci(n));
    }
}
