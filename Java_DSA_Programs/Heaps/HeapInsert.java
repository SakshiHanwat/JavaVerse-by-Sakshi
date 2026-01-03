import java.util.*;

public class HeapInsert {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int idx = arr.size() - 1;
            int parent = (idx - 1) / 2;

            while (idx > 0 && arr.get(idx) > arr.get(parent)) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(parent));
                arr.set(parent, temp);

                idx = parent;
                parent = (idx - 1) / 2;
            }
        }

        public void print() {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);

        h.print();
    }
}
