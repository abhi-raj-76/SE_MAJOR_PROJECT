public class HouseRobberIII {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    private static int[] helper(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        int robThis = node.val + left[1] + right[1];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{robThis, notRob};
    }
}