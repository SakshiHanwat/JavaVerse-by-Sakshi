public class FloodFill {

    public static void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }

        if (vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }

        image[sr][sc] = color;
        vis[sr][sc] = true;

        helper(image, sr, sc + 1, color, vis, orgColor);
        helper(image, sr, sc - 1, color, vis, orgColor);
        helper(image, sr + 1, sc, color, vis, orgColor);
        helper(image, sr - 1, sc, color, vis, orgColor);
    }

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String args[]) {
        int image[][] = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1, sc = 1, color = 2;

        image = floodFill(image, sr, sc, color);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
