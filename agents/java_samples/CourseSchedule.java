public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        java.util.List<java.util.List<Integer>> graph = new java.util.ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new java.util.ArrayList<>());
        for (int[] pre : prerequisites) graph.get(pre[1]).add(pre[0]);
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && !dfs(i, graph, visited)) return false;
        }
        return true;
    }

    private static boolean dfs(int node, java.util.List<java.util.List<Integer>> graph, int[] visited) {
        visited[node] = 1;
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor] == 1) return false;
            if (visited[neighbor] == 0 && !dfs(neighbor, graph, visited)) return false;
        }
        visited[node] = 2;
        return true;
    }
}