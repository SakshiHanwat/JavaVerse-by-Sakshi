import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(1); // duplicate

        System.out.println(set); // insertion order
    }
}
