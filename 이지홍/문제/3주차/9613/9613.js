var fs = require('fs');
var inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
var cases = Number(inputs[0]);
var answer = [];
for(var i=1; i<=cases; i++){
    var splited = inputs[i].split(' ');
    var nums = Number(splited[0]);
    var result = 0;
    for(var j=1; j<=nums; j++){
        for(var k=j+1; k<=nums; k++){
            var common = gcd(Number(splited[j]), Number(splited[k]));
            result += common;
        }
    }
    answer.push(result);
}
console.log(answer.join('\n').trim());
var tmp;
function gcd(a,b){
    while(b != 0){
        tmp = a%b;
    	a = b;
    	b = tmp;
    }
    return a;
}