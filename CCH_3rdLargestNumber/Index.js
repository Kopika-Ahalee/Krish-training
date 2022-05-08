const prompt = require('prompt-sync')({sigint: true});
var inputArray = [];
const numSize = prompt("Enter your number size: ");
if(numSize < 3){
    console.log('Number size is less than three! ')
} else{
    for (let i = 0; i < numSize; i++) {
        const number = prompt('Enter your number here: ');
        inputArray[i] = Number(number); 
    }
    console.log(inputArray);

    function arrangeData(dataset){
        for (let i = 0; i < inputArray.length; i++) {
            for (let j = i+1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    var hold = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = hold;
                }
                
            }
        }
        console.log(inputArray);
        console.log('Third Largest Number is: ' + inputArray[2]);
        
    }
    arrangeData(inputArray);
}



