import java.util.*;

public class GetMinHeap {

    static ArrayList<Integer> heap = new ArrayList<>();

    static void insert(int val) {
        heap.add(val);
        int idx = heap.size() - 1;
        int parent = (idx - 1) / 2;

        while (idx > 0 && heap.get(idx) < heap.get(parent)) {
            int temp = heap.get(idx);
            heap.set(idx, heap.get(parent));
            heap.set(parent, temp);

            idx = parent;
            parent = (idx - 1) / 2;
        }
    }

    static int getMin() {
        return heap.get(0);
    }

    public static void main(String[] args) {
        insert(10);
        insert(3);
        insert(15);
        insert(2);

        System.out.println("Min element = " + getMin());
    }
}
