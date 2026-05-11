public class DeepestLeavesSum {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.add(root);
        int sum = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        return sum;
    }
}