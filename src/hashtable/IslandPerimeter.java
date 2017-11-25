package hashtable;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
    public static int islandPerimeter(int[][] grid) {
        int cell = 0, side = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    cell++;
                    if (i != grid.length - 1 && grid[i + 1][j] == 0)
                        side++;
                    if (j != grid[0].length - 1 && grid[i][j + 1] == 0)
                        side++;
                }
            }
        }
        return cell * 4 - 2 * side;
    }
}
