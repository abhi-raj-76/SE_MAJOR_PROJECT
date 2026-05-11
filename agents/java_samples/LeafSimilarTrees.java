public class LeafSimilarTrees {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        java.util.List<Integer> leaves1 = new java.util.ArrayList<>();
        java.util.List<Integer> leaves2 = new java.util.ArrayList<>();
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    private static void collectLeaves(TreeNode node, java.util.List<Integer> leaves) {
        if (node == null) return;
        if (node.left == null && node.right == null) leaves.add(node.val);
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}