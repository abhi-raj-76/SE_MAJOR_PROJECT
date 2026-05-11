public class CourseScheduleIIIV {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        java.util.List<Integer>[] graph = new java.util.ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) graph[i] = new java.util.ArrayList<>();
        for (int[] p : prerequisites) graph[p[1]].add(p[0]);
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && !dfs(graph, visited, i)) return false;
        }
        return true;
    }

    private boolean dfs(java.util.List<Integer>[] graph, int[] visited, int node) {
        if (visited[node] == 1) return false;
        if (visited[node] == 2) return true;
        visited[node] = 1;
        for (int nei : graph[node]) {
            if (!dfs(graph, visited, nei)) return false;
        }
        visited[node] = 2;
        return true;
    }
}