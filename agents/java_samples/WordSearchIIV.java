public class WordSearchIIV {
    public java.util.List<String> findWords(char[][] board, String[] words) {
        java.util.List<String> result = new java.util.ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, java.util.List<String> result) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' || node.children[board[i][j] - 'a'] == null) {
            return;
        }
        char c = board[i][j];
        TrieNode child = node.children[c - 'a'];
        board[i][j] = '#';
        if (child.word != null) {
            result.add(child.word);
            child.word = null;
        }
        dfs(board, i+1, j, child, result);
        dfs(board, i-1, j, child, result);
        dfs(board, i, j+1, child, result);
        dfs(board, i, j-1, child, result);
        board[i][j] = c;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) node.children[c - 'a'] = new TrieNode();
                node = node.children[c - 'a'];
            }
            node.word = word;
        }
        return root;
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }
}