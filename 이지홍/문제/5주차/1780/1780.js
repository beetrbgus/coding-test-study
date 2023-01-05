const fs = require("fs");
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

const N = Number(input[0]);
const arr = input.slice(1).map((v) => v.split(" ").map(Number));

let answer = [0, 0, 0];

function recursion(y, x, n) {
  let target = arr[y][x];
  let flag = true;

  for (let i = y; i < y + n; i++) {
    for (let j = x; j < x + n; j++) {
      if (arr[i][j] !== target) {
        flag = false;
        break;
      }
    }
    if (!flag) break;
  }

  if (flag) {
    answer[target + 1]++;
  } else {
    recursion(y, x, n / 3);
    recursion(y, x + n / 3, n / 3);
    recursion(y, x + (n / 3) * 2, n / 3);
    recursion(y + n / 3, x, n / 3);
    recursion(y + n / 3, x + n / 3, n / 3);
    recursion(y + n / 3, x + (n / 3) * 2, n / 3);
    recursion(y + (n / 3) * 2, x, n / 3);
    recursion(y + (n / 3) * 2, x + n / 3, n / 3);
    recursion(y + (n / 3) * 2, x + (n / 3) * 2, n / 3);
  }
}

recursion(0, 0, N);

console.log(answer.join("\n"));