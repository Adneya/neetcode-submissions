class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Step 1: Ensure the board conforms to a standard 9x9 layout
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }
        
        Set<String> seen = new HashSet<>();
    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                
               
                if (number != '.') {
                    if (!seen.add(number + " found in row " + i) ||
                        !seen.add(number + " found in col " + j) ||
                        !seen.add(number + " found in box " + i / 3 + "-" + j / 3)) {
                        return false; 
                    }
                }
            }
        }
        return true;
    }
}
