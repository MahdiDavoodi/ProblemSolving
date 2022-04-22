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

function vowelsAndConsonants(s) {
  for (let ch of s) if (isVowels(ch)) console.log(ch);

  for (let ch of s) if (!isVowels(ch)) console.log(ch);
}

function isVowels(c) {
  return c == "a" || c == "e" || c == "i" || c == "o" || c == "u";
}

/*
 * Iterate through the string using a for-of loop.
 */
