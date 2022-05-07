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
  let re = /(Mr|Mrs|Ms|Dr|Er)\.[a-zA-Z]+$/;
  return re;
}

/*
 * The "(Mr|Mrs|Ms|Dr|Er)" is simply for matching the prefix of the string.
 * "\." is the dot with a scape so we can match the dot after those prefix.
 * "[a-zA-Z]+$" means that there should be at least one letter at the end of the string!
 */

function main() {
  const re = regexVar();
  const s = readLine();

  console.log(!!s.match(re));
}
