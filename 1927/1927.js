//문제: 1927
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  const arr = [];
  input.shift();
  input.forEach((e) => {
    if (e === "0") {
      arr.sort((a, b) => a - b);
      console.log(arr.splice(0, 1)[0] ?? 0);
    } else arr.push(+e);
  });
}
