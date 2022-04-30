"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

function getMaxLessThanK(n, k) {
  let max = Number.MIN_SAFE_INTEGER;
  let temp = -1;
  for (var i = 1; i <= n; i++) {
    for (var j = i + 1; j <= n; j++) {
      temp = i & j;
      if (temp < k && temp > max) max = temp;
    }
  }
  return max;
}

/*
 * Some good videos that I watched on YouTube:
 * https://www.youtube.com/watch?v=mesu75PTDC8
 * https://www.youtube.com/watch?v=VLflTjd3lWA&t=180s
 * https://www.youtube.com/watch?v=rsxT4FfRBaM&t=617s
 */

function main() {
  const q = +readLine();

  for (let i = 0; i < q; i++) {
    const [n, k] = readLine().split(" ").map(Number);

    console.log(getMaxLessThanK(n, k));
  }
}
