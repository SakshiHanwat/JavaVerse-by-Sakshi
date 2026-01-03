import java.util.*;

public class InsertInHeapMin {

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

    public static void main(String[] args) {
        insert(10);
        insert(5);
        insert(20);
        insert(2);

        System.out.println(heap);
    }
}
