package net.ed;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("CodeFights.com RotateImage Challenge");

        rotateImage(arr);
    }

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

    public static String rotateImage(int[][] arr) {

        int aLength = arr.length;
        System.out.println(aLength);

        int r = 0;
        int c = 0;
        for(c = aLength - 1; c >= 0; c--){
            for(r = 0; r < aLength; r++){
                System.out.println(r + " " + c);
            }
            System.out.println(r + " " + c);
        }

        return("\n" + arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3]);
    }

}
