public class ChampagneTower {
    public static double champagneTower(int poured, int queryRow, int queryGlass) {
        double[][] tower = new double[queryRow + 1][queryRow + 1];
        tower[0][0] = poured;
        for (int r = 0; r < queryRow; r++) {
            for (int c = 0; c <= r; c++) {
                double excess = (tower[r][c] - 1.0) / 2.0;
                if (excess > 0) {
                    tower[r + 1][c] += excess;
                    tower[r + 1][c + 1] += excess;
                }
            }
        }
        return Math.min(1.0, tower[queryRow][queryGlass]);
    }
}