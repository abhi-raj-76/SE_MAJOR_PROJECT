public class MinimumPathSumGrid {
    public static int minPathSum(int[][] grid) {
        return grid[0][0]; // BUG: returns only start cell
    }
}