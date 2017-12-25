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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("CodeFights.com RotateImage Challenge");

        rotateImage(arr);
    }

    public static String rotateImage(int[][] arr) {
        int aLength = arr.length;

        // print the array passed in
        System.out.println("original array");
        for(int r = 0;  r < aLength; r++) {
            for (int c = 0; c < aLength; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

//        int aLength = arr.length;
//        System.out.println(aLength);

        int[][] arr2 = new int[aLength][aLength];

        int r = 0;
        int c = 0;
        int r2 = 0;
        int c2 = 0;

        System.out.println();

        // print the grid [r][c] before rotating
        System.out.println("print grid before rotating");
        for(r = 0;  r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print("[" + r + "][" + c + "]");
                if(c < aLength - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();


        // assign c to r --> r = c
        // then c decrements from aLength-1 to 0
        for (int i = 0; i < aLength; i++) {
            for (c = aLength - 1; c >= 0; c--) {
                for (r =0; r < aLength; r++) {

                    arr2[r][r] = arr[r][c];
                    // arr2[r][c] = arr[r2][c2];
                }
            }
        }

        // rotate the grid cw
//        for(c2 = aLength - 1; c2 >= 0; c2--) {
//            for (r2 = aLength - 1; r2 >= 0; r2--) {
//                for (c = 0; c < aLength; c++) {
//                    for (r =0; r < aLength; r++) {
//                        arr2[c][r] = arr[r2][c2];
////                        arr2[r][c] = arr[r2][c2];
//                    }
//                }
//            }
//        }


        // rotate a second time
//        for (r = 0;  r < aLength; r++) {
//            for (c = 0; c < aLength; c++) {
////            for(c = aLength - 1; c >= 0; c--) {
//                arr2[r][c] = arr2[c][r];
//            }
//        }

        for( r = 0;  r < aLength; r++) {
            for ( c = 0; c < aLength; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // print the grid [r][c] after rotating
//        System.out.println("print grid after rotating");
//        for(r = 0;  r < aLength; r++) {
//            for (c = 0; c < aLength; c++) {
//                System.out.print("[" + r + "][" + c + "]");
//                if(c < aLength - 1)
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();


        // print the rotated [r][c] grid
//        System.out.println("print grid after rotating");
//        for(c2 = aLength - 1; c2 >= 0; c2--) {
//            for (r2 = 0; r2 < aLength; r2++) {
//                System.out.print("[" + r2 + "][" + c2 + "]");
//                if(c2 < aLength)
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        System.out.println();

        // print the array elements after rotating
//        System.out.println("array after rotating");
//        for(r = 0;  r < aLength; r++) {
//            for (c = 0; c < aLength; c++) {
//                System.out.print(arr2[r][c] + " ");
//            }
//            System.out.println();
//        }

        // 4x4 array
//        return("\n" + arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3]);

        // 3x3 array
        return("\n" + arr[0] + "\n" + arr[1] + "\n" + arr[2]);
    }

}
