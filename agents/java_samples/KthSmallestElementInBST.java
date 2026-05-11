public class KthSmallestElementInBST {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int kthSmallest(TreeNode root, int k) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private static void inorder(TreeNode node, java.util.List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}