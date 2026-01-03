import java.util.*;

public class KNearestCars {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.distSq = x * x + y * y;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < pts.length; i++) {
            pq.add(new Point(pts[i][0], pts[i][1]));
        }

        for (int i = 0; i < k; i++) {
            Point p = pq.remove();
            System.out.println(p.x + " , " + p.y);
        }
    }
}
