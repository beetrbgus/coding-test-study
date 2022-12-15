var fs = require('fs');
var inputs = fs.readFileSync('/dev/stdin').toString().split(' ');
var char = inputs[0].split('').reverse();
var base = Number(inputs[1]);
var result = 0;
for(var i=0; i<char.length;i++){
    if(char[i] >= 'A' && char[i] <= 'Z'){
        char[i] = char[i].charCodeAt(0)-55;
        result += char[i] * Math.pow(base,i);
    }else{
        char[i] = Number(char[i]);
        result += char[i] * Math.pow(base,i);
    }
}
console.log(result);