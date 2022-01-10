# Diagonal Difference

✅ Try to solve [this](https://www.hackerrank.com/challenges/diagonal-difference/problem) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> Given a square matrix, calculate the absolute difference between the sums of its diagonals.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun main() {
    val n = readLine()!!.toInt() - 1
    val list = ArrayList<List<Int>>()
    for (i in 0..n)
        list.add(readLine()!!.trim().split(" ").map { x -> x.toInt() }.toList())
    var a = 0; var b = 0
    for ((j, i) in (n downTo 0).withIndex()) {
        a += list[i][i]
        b += list[j][i]
    }
    println("${(a - b).absoluteValue}")
}
```

Use two `for` loops to solve this. The first one is for filling an array that contains arrays of integers. Read the input line by line and insert everything in the main array as a list.

Using the second `for` loop, calculate the sum of two diagonals and then return the absolute difference.
