# Breaking the Records

✅ Try to solve [this](https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
>
> Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val list = ArrayList<Int>(); val scanner = Scanner(System.`in`); val n = scanner.nextInt()
    for (i in 1..n)
        list.add(scanner.nextInt())
    var max = Int.MIN_VALUE; var min = Int.MAX_VALUE; var recordPlus = 0; var recordMinus = 0
    list.forEach {
        if (it > max) {
            max = it
            recordPlus++
        }
        if (it < min) {
            min = it
            recordMinus++
        }
    }
    println("${--recordPlus} ${--recordMinus}")
}
```

I think I solved this problem in the worst possible way. Started from the first of the array, iterate through it and whenever my max and min values got changed, I counted it.
