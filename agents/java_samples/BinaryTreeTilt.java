public class BinaryTreeTilt {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int findTilt(TreeNode root) {
        int[] total = new int[1];
        sum(root, total);
        return total[0];
    }

    private static int sum(TreeNode node, int[] total) {
        if (node == null) return 0;
        int left = sum(node.left, total);
        int right = sum(node.right, total);
        total[0] += Math.abs(left - right);
        return node.val + left + right;
    }
}