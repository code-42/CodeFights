// My first CodeFights challenge
// https://codefights.com/interview-practice/task/pMvymcahZ8dY4g75q
// With a little help from TutorialsPoint
// https://www.tutorialspoint.com/es6/es6_arrays.htm
// Lesson learned: it's harder than you first think it is
// See README.md for Problem Statement

function firstDuplicate(a) {
    var aLength = a.length;
    var numbers = new Array(aLength);

    for (var i = 0; i < aLength; i++){
        if(numbers[a[i]] != undefined){
            return a[i];
        }
        numbers[a[i]] = 1;
    }

    return -1;
}

console.log(firstDuplicate([2, 3, 3, 1, 5, 2])); // 3
console.log(firstDuplicate([2, 4, 3, 5, 1])); // -1
