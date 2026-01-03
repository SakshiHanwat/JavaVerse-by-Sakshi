import java.util.*;

public class DeleteFromHeap {

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

    static void heapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heap.size() && heap.get(left) < heap.get(smallest))
            smallest = left;

        if (right < heap.size() && heap.get(right) < heap.get(smallest))
            smallest = right;

        if (smallest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            heapify(smallest);
        }
    }

    static int deleteMin() {
        int min = heap.get(0);

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        heapify(0);
        return min;
    }

    public static void main(String[] args) {
        insert(10);
        insert(5);
        insert(20);
        insert(2);

        System.out.println("Deleted = " + deleteMin());
        System.out.println(heap);
    }
}
