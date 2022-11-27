const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const iter = Number(input.shift());

// 큐 생성
let queue = [];

let ans = [];

for(let i = 0; i < iter; i++){
    let [cmd, num] = input[i].split(" ");
    
    if(cmd === "push"){
        queue.push(num);
    } else if(cmd === "pop"){
        if(queue.length > 0){
            ans.push(queue.shift());
        } else {
            ans.push(-1);
        }
    } else if(cmd === "size"){
        ans.push(queue.length);
    } else if(cmd === "empty"){
        if(queue.length > 0){
            ans.push(0);
        } else {
            ans.push(1);
        }
    } else if(cmd === "front"){
        if(queue.length > 0){
            ans.push(queue[0]);
        } else {
            ans.push(-1);
        }
    } else{
        if(queue.length > 0){
            ans.push(queue[queue.length - 1]);
        } else{
            ans.push(-1);
        }
    }
}

console.log(ans.join("\n"));