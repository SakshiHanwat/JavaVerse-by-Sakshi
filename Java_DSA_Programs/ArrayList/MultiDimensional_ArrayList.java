import java.util.ArrayList;

public class MultiDimensional_ArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);

        // 🔑 add sublists to mainlist
        mainlist.add(list);
        mainlist.add(list1);

        // print using loops
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // direct print
        System.out.println(mainlist);
    }
}
