import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // remove elements out of window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }

            // remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.add(i);

            // print max
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }
}
