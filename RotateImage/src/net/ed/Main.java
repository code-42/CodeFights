package net.ed;

// CodeFights challenge rotateImage
// https://codefights.com/interview-practice/task/5A8jwLGcEpTPyyjTB

// Lesson learned: it's harder than you first think it is
// See README.md for Problem Statement

    /*
    Test 1
    Input:
         a: [[1,2,3],
             [4,5,6],
             [7,8,9]]

    Expected Output:
            [[7,4,1],
             [8,5,2],
             [9,6,3]]
    */

public class Main {

    public static void main(String[] args) {

//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("CodeFights.com RotateImage Challenge");

        rotateImage(arr);
    }

    public static void rotateImage(int[][] arr1) {
        int aLength = arr1.length;

        int[][] arr2 = new int[aLength][aLength];

        int r = 0;
        int c = 0;

        // print the array passed in
        System.out.println("original array elements");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print(arr1[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // print the grid [r][c] before rotating
        System.out.println("print grid before rotating");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print("[" + r + "][" + c + "] " + arr1[r][c]);
                if (c < aLength - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        ////////////////////////////////////////

        System.out.println("switch row and column with looping");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                // subtract row loop from aLength and put in col index
//                System.out.print("74. " + (aLength - (r + 1)) + " ");
                arr2[c][aLength - (r + 1)] = arr1[r][c];
            }
        }

        System.out.println();
        System.out.println("print grid after rotating");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print("[" + r + "][" + c + "] " + arr2[r][c]);
                if (c < aLength - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("print elements");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();


    }
}




