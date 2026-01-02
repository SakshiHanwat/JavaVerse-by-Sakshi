import java.util.*;

public class ChocolateProblem {

    public static void main(String[] args) {

        // Dimensions
        int n = 4; // rows
        int m = 6; // columns

        // Costs (same as notebook)
        Integer[] costVer = {2, 1, 3, 1, 4}; // m-1
        Integer[] costHor = {4, 1, 2};       // n-1

        // Sort in descending order (IMPORTANT – greedy)
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // horizontal & vertical pieces
        int cost = 0;

        // Greedy selection
        while (h < costHor.length && v < costVer.length) {

            if (costVer[v] >= costHor[h]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            v++;
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            h++;
        }

        System.out.println("Minimum cost to break chocolate = " + cost);
    }
}
