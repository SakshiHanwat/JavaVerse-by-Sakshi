import java.util.*;

class Day_0042_LastStoneWeight_1046 {
    public int lastStoneWeight(int[] stones) {
        // max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : stones) { 
            pq.add(ele);
        }

        while (pq.size() > 1) {
            int max = pq.remove();
            int smax = pq.remove();

            int nstone = max - smax;

            if (nstone != 0) {
                pq.add(nstone);
            }
        }

        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.remove();
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] stones = {2, 7, 4, 1, 8, 1};

        int result = obj.lastStoneWeight(stones);

        System.out.println("Last Stone Weight: " + result);
    }
}
