# Designer PDF Viewer

✅ Try to solve [this](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val alphabet = mutableMapOf<Char, Int>()
    for ((counter, height) in h.withIndex()) alphabet[(counter + 97).toChar()] = height
    var biggestChar = 'a'
    var max = Int.MIN_VALUE
    for (ch in word) if (alphabet[ch]!! > max) {
        max = alphabet[ch]!!
        biggestChar = ch
    }
    return alphabet[biggestChar]?.times(word.length) ?: 0
}
```
> Kotlin

Create a map named `alphabet`. Set the keys as the alphabet characters and the values as the heights. Find the biggest character of the entered word. Return `biggestHeight * word.length`.
