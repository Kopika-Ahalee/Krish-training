const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('First Word: ', word1 => {
 readline.question('Second Word: ' , word2=>{
     
     console.log(word1, word2);
     checkWordsAnagram(word1,word2);
     readline.close();
  })
});

function checkWordsAnagram(x, y) {
  let W1L = x.length;
  let W2L = y.length;
  if(W1L !== W2L){
     console.log('Inputs are not valid');
  }

  let W1LC = x.toLowerCase();
  let W2LC = y.toLowerCase();
  let str1 = W1LC.split('').sort().join('');
  let str2 = W2LC.split('').sort().join('');
  if(str1 === str2){
     console.log("Both are Anagram Words...");
  } else { 
     console.log("Both are not Anagram Words");
  }

}