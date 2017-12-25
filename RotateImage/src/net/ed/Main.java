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

    public static void rotateImage(int[][] arr) {
        int aLength = arr.length;

        // print the array passed in
        System.out.println("original array elements");
        for (int r = 0; r < aLength; r++) {
            for (int c = 0; c < aLength; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[aLength][aLength];

        int r = 0;
        int c = 0;
        int r2 = 0;
        int c2 = 0;

        System.out.println();

        // print the grid [r][c] before rotating
        System.out.println("print grid before rotating");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print("[" + r + "][" + c + "]");
                if (c < aLength - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        ////////////////////////////////////////

        System.out.println("flip it vertically");
        for (r = aLength - 1; r >= 0; r--) {
            for (c = 0; c < aLength; c++) {

                arr2[c][r] = arr[r][c];

                System.out.print("[" + r + "][" + c + "]");
                if (c < aLength)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        ////////////////////////////////////////

        System.out.println("flip it horizontally");
        for (r = aLength - 1; r >= 0; r--) {
            for (c = aLength - 1; c >= 0; c--) {
                arr2[c][r] = arr2[r][c];
                System.out.print("[" + r + "][" + c + "]");
                if (c < aLength)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        ////////////////////////////////////////

        System.out.println("flip it vertically again");
        for (r = 0; r < aLength; r++) {
            for (c = aLength - 1; c >= 0; c--) {
//                for (c = 0; c < aLength; c++) {

                    arr2[r][c] = arr2[c][r];

                    System.out.print("[" + r + "][" + c + "]");
                    if (c < aLength)
                        System.out.print(" ");
//                }
//                System.out.println();
            }
            System.out.println();
        }

        System.out.println("print rotated array elements");
        for (r = 0; r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}




