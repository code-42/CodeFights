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

function rotateImage(a) {
    
    var aLength = a.length;
    console.log(aLength);
    
    for(var c = aLength - 1; c >= 0; c--){
        for(var r = 0; r < aLength; r++){
            console.log(r,c);
        }
        console.log(r,c);
    }




    return("\n" + a[0] + "\n" + a[1] + "\n" + a[2] + "\n" + a[3]);
}

// console.log(rotateImage([[1,2,3],[4,5,6],[7,8,9]]));

console.log(rotateImage([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]));