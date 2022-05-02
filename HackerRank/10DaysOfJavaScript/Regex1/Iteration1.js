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

function regexVar() {
  const re = /^([aeiou]).+\1$/;
  return re;
}
/*
 * I should learn Regex syntax but the problem is, since I don't use it on daily bases, I will forget it.
 * So, maybe later.
 */

function main() {
  const re = regexVar();
  const s = readLine();

  console.log(re.test(s));
}
