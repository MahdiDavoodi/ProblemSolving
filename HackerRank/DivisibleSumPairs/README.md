# Divisible Sum Pairs

✅ Try to solve [this](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> Given an array of integers and a positive integer `k`, determine the number of `(i, j)` pairs where `i < j` and `ar[i]` + `ar[j]` is divisible by `k`.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun divisibleSumPairs(k: Int, ar: Array<Int>): Int {
    var count = 0
    for (i in ar.indices) for (j in ar.indices) if (i < j && (ar[i] + ar[j]) % k == 0) count++
    return count
}

fun main() = println(
    divisibleSumPairs(
        readLine()!!.trimEnd().split(" ")[1].toInt(),
        readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    )
)
```
> Kotlin

Create a variable named `count` and set it to 0. Iterate trough the array and check the condition (`if (i < j && (ar[i] + ar[j]) % k == 0)`). If it's true, add one to the `count`. Return the count.
