public class SerializeDeserializeBSTVI {
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] vals = data.split(",");
        java.util.Queue<String> q = new java.util.LinkedList<>(Arrays.asList(vals));
        return deserializeHelper(q, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deserializeHelper(java.util.Queue<String> q, int min, int max) {
        if (q.isEmpty()) return null;
        String s = q.peek();
        int val = Integer.parseInt(s);
        if (val < min || val > max) return null;
        q.poll();
        TreeNode root = new TreeNode(val);
        root.left = deserializeHelper(q, min, val);
        root.right = deserializeHelper(q, val, max);
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}