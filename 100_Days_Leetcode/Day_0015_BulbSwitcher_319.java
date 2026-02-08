class Solution {

    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }
        return count;
    }

    // main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 10; // example input
        int result = sol.bulbSwitch(n);

        System.out.println("Number of bulbs ON after " + n + " rounds = " + result);
    }
}
