public class CourseScheduleII {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        java.util.List<java.util.List<Integer>> graph = new java.util.ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new java.util.ArrayList<>());
        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        for (int i = 0; i < numCourses; i++) if (indegree[i] == 0) q.add(i);
        int[] order = new int[numCourses];
        int index = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            order[index++] = course;
            for (int next : graph.get(course)) {
                if (--indegree[next] == 0) q.add(next);
            }
        }
        return index == numCourses ? order : new int[0];
    }
}