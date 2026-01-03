import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);

        System.out.println(set); // sorted order
    }
}
