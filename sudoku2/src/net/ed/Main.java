package net.ed;

/*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.
Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by griddoes not have to be solvable.
Example
* For
grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
        ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
        ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
        ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
        ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
        ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
        ['.', '.', '.', '5', '.', '.', '.', '7', '.']]

the output should be

sudoku2(grid) = true;
* For
grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
        ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
        ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
        ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
        ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
        ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
        ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
        ['.', '2', '.', '.', '3', '.', '.', '.', '.']]

the output should be

sudoku2(grid) = false.

The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3subgrid can only contain the numbers 1 through 9 one time.
Input/Output
* [execution time limit] 4 seconds (js)
* [input] array.array.char grid
A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.
* [output] boolean
Return true if grid represents a valid Sudoku puzzle, otherwise return false.
[JavaScript (ES6)] Syntax Tips
// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*/

public class Main {

    public static void main(String[] args) {

        String[][] grid = new String[][]{
                {".",".",".","1","4",".",".","2","."},
                {".",".","6",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},
                {".",".","1",".",".",".",".",".","."},
                {".","6","7",".",".",".",".",".","9"},
                {".",".",".",".",".",".","8","1","."},
                {".","3",".",".",".",".",".",".","6"},
                {".",".",".",".",".","7",".",".","."},
                {".",".",".","5",".",".",".","7","."}};

    boolean isSudoku2 = sudoku2(grid);

    }

    public static boolean sudoku2(String[][] grid) {

        System.out.println("This is sudoku2");

        // Find all numeric characters in grid and print to screen
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid.length; c++){
                if (grid[r][c] != "."){
                    System.out.println("grid[" + r + "][" + c + "] == " + grid[r][c]);
                }
            }
        }

        return true;

    }

}
