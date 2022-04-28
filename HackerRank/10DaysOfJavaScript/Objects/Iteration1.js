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

function Rectangle(a, b) {
  this.length = a;
  this.width = b;
  this.perimeter = (a + b) * 2;
  this.area = a * b;
}

/*
 * In JavaScript, we can create constructors like this!
 */

function main() {
  const a = +readLine();
  const b = +readLine();

  const rec = new Rectangle(a, b);

  console.log(rec.length);
  console.log(rec.width);
  console.log(rec.perimeter);
  console.log(rec.area);
}
