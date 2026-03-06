package leetcode.backtraking;

public class Q_51_NQueens {
    public static void main(String[] args) {

    }
    static void display(boolean[][] board){

    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count
    }
    static boolean isSafe()
}
