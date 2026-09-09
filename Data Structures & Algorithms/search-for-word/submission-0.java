class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] read = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, read, 0, r, c, word))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] read, int i, int r, int c, String word) {
        if (i == word.length())
            return true;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || read[r][c]
            || board[r][c] != word.charAt(i))
            return false;
        read[r][c] = true;
        if (dfs(board, read, i + 1, r + 1, c, word) || dfs(board, read, i + 1, r - 1, c, word)
            || dfs(board, read, i + 1, r, c + 1, word) || dfs(board, read, i + 1, r, c - 1, word))
            return true;
        read[r][c] = false;
        return false;
    }
}
