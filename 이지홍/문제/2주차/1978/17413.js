const input = require("fs").readFileSync("/dev/stdin").toString().trim();
var I = input.split("\n");
var N = Number(I.shift());
I = I[0].split(" ").map(Number);
var count = 0;
for (let i = 0; i < N; i++) {
  let flag = 1;
  if (I[i] == 1) continue;
  for (let j = 2; j <= Math.floor(Math.sqrt(I[i])); j++) {
    if (I[i] % j === 0) flag = 0;
  }
  if (flag) count++;
}
console.log(count);