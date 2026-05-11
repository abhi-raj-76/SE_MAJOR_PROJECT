public class TriangleMinimumTotal {
    public static int minimumTotal(java.util.List<java.util.List<Integer>> triangle) {
        if (triangle.isEmpty()) return 0;
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int minBelow = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, triangle.get(i).get(j) + minBelow);
            }
        }
        return triangle.get(0).get(0);
    }
}