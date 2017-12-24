// My second CodeFights challenge
// https://codefights.com/interview-practice/task/uX5iLwhc6L5ckSyNC
// With a little help from TutorialsPoint
// https://www.tutorialspoint.com/es6/es6_arrays.htm
// Lesson learned: it's harder than you first think it is
// See README.md for Problem Statement

function firstNotRepeatingCharacter(s) {
    
    // Declare and initialize variables
    var cArray = s.split("");
    var sLength = s.length;
    var repeatArray = new Array(sLength);
    var isRepeat = false;

    if(sLength){ // Same as if(sLength > 0 && sLength != undefined)
        for (var i = 0; i < sLength; i++){
          // console.log("13. cArray[" + i + "] == " + cArray[i]);
          
          // If repeatArray contains the character at cArray[i] already, loop again 
          if(repeatArray.indexOf(cArray[i]) != -1){
            // console.log("14. cArray[" + i + "] exitst in repeatArray");
            continue;
          }
          
          // Put the character at cArray[i] in repeatArray
          repeatArray[i] = cArray[i];
          
          // Now loop through cArray looking for character in repeatArray
          for(var j = i; j < sLength; j++){
            // console.log("15. " + repeatArray[i] + " ? " + cArray[j+1]);
            
            // The character in cArray exists in repeatArray, so break out of loop
            if(repeatArray[i] == cArray[j+1]){
              isRepeat = true;
              // console.log("18. isRepeat = true");
              break;
            }
            
            
            isRepeat = false;
            // console.log("21. isRepeat = false");
            
            // Looped to the end of cArray and did not find character in repeatArray
            // so return that character and exits program
            if(cArray[j+1] == undefined){
              return cArray[i];
            }
          }
        }
    }
    
    // Character was not found to repeat in the input string
    return "_";
}

console.log(firstNotRepeatingCharacter("abaccdaba")); // c

console.log(firstNotRepeatingCharacter("abaxzcabaabacaba")); // _
