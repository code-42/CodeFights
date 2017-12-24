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

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("CodeFights.com RotateImage Challenge");

        rotateImage(arr);
    }

    public static String rotateImage(int[][] arr) {
        int aLength = arr.length;

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

        for(r = 0;  r < aLength; r++) {
            arr2[r2] = arr[r];
            for (c = 0; c < aLength; c++) {
                arr2[c2] = arr[c];
                System.out.println(r + " " + c);
            }
            System.out.println();
        }

        for(c2 = aLength; c2 >= 0; c2--) {
            for (r2 = 0; r2 < aLength; r2++) {
                System.out.println(r2 + " " + c2);
            }
            System.out.println();
        }

        for(r = 0;  r < aLength; r++) {
            for (c = 0; c < aLength; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }
        return("\n" + arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3]);
    }

}
