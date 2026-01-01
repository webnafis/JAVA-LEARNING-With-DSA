import java.util.*;
class Practice{
    public static void changeArr(int arr[], int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printSubsetsOfString(String st, String sb, int i){
        if(i == st.length()){
            System.out.println(sb);
            return;
        }

        printSubsetsOfString(st, sb, i+1);
        printSubsetsOfString(st, sb + st.charAt(i), i+1);
    }

    public static void printPermutationsOfString(String per, String st){
        if(st.length() == 0 ){
            System.out.println(per);
            return;
        }
        for(int i= 0; i< st.length(); i++){
            char curr = st.charAt(i);
            String str = st.substring(0, i) + st.substring(i+1);
            printPermutationsOfString(per+ curr, str);
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static boolean isSafe(char[][] board, int i, int j){
        for(int r= i-1; r>-1; r--){
            if(board[r][j] == 'Q'){
                return false;
            }
        }
        for(int k = i-1, l = j-1; k>-1 && l>-1; k--, l--){
            if(board[k][l] == 'Q'){
                return false;
            }
        }
        for(int k = i-1, l = j+1; k>-1 && l<board.length; k--, l++){
            // total length of row and column same
            if(board[k][l] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static int nQueens(char[][] board, int row){// O(n!)
        if(row == board.length){
            printBoard(board);
            return 1;
        }
        int ways = 0;
        for(int j = 0; j< board[row].length; j++){
            if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            ways += nQueens(board, row+1);
            board[row][j] = 'X';
            }
        }
        return ways;
        
    }

    public static boolean nQueensPossible(char[][] board, int row){
        if(row == board.length){
            printBoard(board);
            return true;
        }
        for(int j = 0; j< board[row].length; j++){
            if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            if(nQueensPossible(board, row+1)){
                return true;
            }
            board[row][j] = 'X';
            
            }
        }
        return false;
        
    }

    public static void printBoard(char[][] board){
        System.out.println("-----------------------Board----------------------");
        for(int i = 0; i< board.length; i++){
            for(int j= 0; j< board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int numberOfGridWays(int n, int m, int i, int j){// O(m*n)
        if(n - 1  == i && m - 1 == j){
            return 1;
        }

        if(m == j || n == i){
            return 0;
        }
// shortcut: total ways: (m-1+n-1)!/((m-1)!(n-1)!)  => O(m+n)
        return numberOfGridWays(n, m, i+1, j) + numberOfGridWays(n, m, i, j+1);
    }

    public static boolean isSafeSudoku(int[][] sudoku, int digit, int r, int c){
        for(int i =0; i<9; i++ ){
            if(sudoku[r][i] == digit || sudoku[i][c] == digit){
                return false;
            }
        }
        int sir = (r/3)*3;
        int sic = (c/3)*3;

        for(int i= sir; i<sir+3; i++){
            for(int j = sic; j< sic+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
// there is better way to solve this but this approach is for learning backtracking 
    public static boolean isSudokuPossible(int[][] sudoku, int r, int c){
        if(9 == r){
            printSudoku(sudoku);
            return true;
        }
        if(sudoku[r][c] != 0){
              if(c == 8){
                    if(isSudokuPossible(sudoku, r+1, 0)){
                        return true;
                    }
                } else{
                    if(isSudokuPossible(sudoku, r, c+1)){
                        return true;
                    }
                }
        }
        for(int i = 1; i<= 9; i++){
            if( isSafeSudoku(sudoku, i, r, c)){
                sudoku[r][c] = i;
                if(c == 8){
                    if(isSudokuPossible(sudoku, r+1, 0)){
                        return true;
                    }
                } else{
                    if(isSudokuPossible(sudoku, r, c+1)){
                        return true;
                    }
                }
                sudoku[r][c] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int[][] sudoku){
        for(int i = 0; i< 9; i++){
            for(int j = 0; j< 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // printSubsetsOfString("nsa", "", 0);
        // printPermutationsOfString("", "nsa");

        int n =  3;
        char[][] c = new char[n][n];
        for(int i = 0; i< n; i++){
            for(int j= 0; j< n; j++){
                c[i][j] = 'X';
            }
        }

        
        // System.out.println(nQueens(c, 0));
        // System.out.println(nQueensPossible(c, 0));
        // System.out.println(numberOfGridWays(3, 3, 0, 0));

        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        System.out.println(isSudokuPossible(sudoku, 0, 0));

    }
}