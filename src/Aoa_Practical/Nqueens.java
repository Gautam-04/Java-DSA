package Aoa_Practical;

public class Nqueens {
    private static int n;
    private static int[][] board;

    public static void main(String[] args) {
        n = 4;
        board  = new int[n][n];
        solveNqueen();
    }

    private static void solveNqueen() {
        if(placeQueen(0)){
            System.out.println("Soln for the N queen exists");
            printQueens();
        }else{
            System.out.println("Soln does not exits");
        }
    }

    private static boolean placeQueen(int col) {
        if(col == n){
            return true;
        }

        for(int i = 0; i < n;i++){
            if(isSafe(i,col)){
                board[i][col] = 1;
                if(placeQueen(col+1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if(board[row][i] == 1){
                return false;
            }
        }

        for(int i = row,j = col;i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row,j = col;i < 0 && j >= 0; i++,j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
    }

    private static void printQueens() {
        for (int i = 0; i < board.length; i++) {
            for(int j = 0;j < board.length;j++){
                if(board[i][j] == 1){
                    System.out.print("Q ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

}
