import java.util.*;

public class GraphCycleDetector {
    public boolean hasCycle(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
        }

        boolean[] visiting = new boolean[vertices];
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (dfs(i, graph, visiting, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfs(int node,
                        List<List<Integer>> graph,
                        boolean[] visiting,
                        boolean[] visited) {

        if (visiting[node]) return true;
        if (visited[node]) return false;

        visiting[node] = true;

        for (int nei : graph.get(node)) {
            if (dfs(nei, graph, visiting, visited)) {
                return true;
            }
        }

        visiting[node] = false;
        visited[node] = true;

        return false;
    }
}