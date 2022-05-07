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
  let re = /[0-9]+/gm;
  return re;
}
/*
 * A very easy one that I actually solved without any headache and search.
 * Using a range, we can match one or more numbers.
 * [0-9] -> this char is a number.
 * + -> one or more.
 * gm -> global multiline flag.
 */

function main() {
  const re = regexVar();
  const s = readLine();

  const r = s.match(re);

  for (const e of r) {
    console.log(e);
  }
}
