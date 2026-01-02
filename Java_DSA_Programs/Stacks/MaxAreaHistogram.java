import java.util.Stack;

public class MaxAreaHistogram {

    public static void maxArea(int[] arr) {

        int maxArea = 0;
        int n = arr.length;

        int[] nsr = new int[n]; // Next Smaller Right
        int[] nsl = new int[n]; // Next Smaller Left

        Stack<Integer> s = new Stack<>();

        // ----------------------------
        // Next Smaller Right (NSR)
        // ----------------------------
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // Clear stack
        s.clear();

        // ----------------------------
        // Next Smaller Left (NSL)
        // ----------------------------
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // ----------------------------
        // Calculate Max Area
        // ----------------------------
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max area in histogram: " + maxArea);
    }

    // ----------------------------
    // Main Method
    // ----------------------------
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 2, 3}; // heights in histogram

        maxArea(arr);
    }
}
