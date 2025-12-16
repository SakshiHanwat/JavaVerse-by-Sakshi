//Given a route containing 4 directions (E,W,N,S) find the shortest path to reach destination
//"WNEENESENNN"
public class ShortestPath_String {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // corrected variable name

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
        }
        // Euclidean distance from origin
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path)); // corrected method call
    }
}
