# Save The Prisoner

✅ Try to solve [this](https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> A jail has several prisoners and several treats to pass out to them. Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially around the table until all have been distributed.
>
> The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. Determine the chair number occupied by the prisoner who will receive that candy.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return if (n == m) if (s == 1) n
    else s - 1
    else {
        val result = (m + s - 1) % n
        if (result == 0) n
        else result
    }
}
```
> Kotlin

Don't do what I did at first. Implement a structure of `if` statements that check all the possible conditions.
