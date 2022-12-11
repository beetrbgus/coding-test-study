var fs = require('fs');
var inputs = fs.readFileSync('/dev/stdin').toString();
var answer = [];
var result = inputs;
for(var i=2; i<=inputs; i++){
    var num = i;
    while(result%num === 0){
   		answer.push(num);
        if(result/num === 1) break;
        result = result/num;
	}
}
console.log(answer.join('\n').trim());