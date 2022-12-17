var fs = require('fs');
var inputs = fs.readFileSync('/dev/stdin').toString().trim();
var answer = '';
while(inputs.length !== 0){
    if(inputs.length>1){
        answer = parseInt(inputs.slice(inputs.length-1), 8).toString(2).padStart(3,'0') + answer;
    }else{
        answer = parseInt(inputs.slice(inputs.length-1), 8).toString(2) + answer;
    }
    inputs = inputs.slice(0, inputs.length-1);
}
console.log(answer);