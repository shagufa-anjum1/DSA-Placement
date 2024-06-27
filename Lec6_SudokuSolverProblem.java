public class Lec6_SudokuSolverProblem {
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if (row==9 && col==0){
            return true;
        }
        // Recursion
        int nextRow = row;
        int nextCol = col+1;
        if (col+1 == 9){
            nextRow = row+1;
            nextCol = row+1;
        }
    }
    public static void main(String[] args){
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,,4,1,9,0},
                {1,8,,5,0,6,0,0,2,0,3},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};
    }
}
