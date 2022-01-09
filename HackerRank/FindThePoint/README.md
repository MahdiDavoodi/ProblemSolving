# Find the Point

✅ Try to solve [this](https://www.hackerrank.com/challenges/find-point/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem on HackerRank.com

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun reflection(array: List<Int>): String {
    val x = (array[2] - array[0]) + array[2]
    val y = (array[3] - array[1]) + array[3]
    return "$x $y"
}
```

`2(x2) - x1`. With that formula, you can find the reflection point.
