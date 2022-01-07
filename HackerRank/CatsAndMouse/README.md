# Cats And Mouse

✅ Try to solve [this](https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.
> If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
> You are given `q` queries in the form of `a`, `y`, and `z` representing the respective positions for cats A and B, and for mouse, C. Complete the function catAndMouse to return the appropriate answer to each query, which will be printed on a new line.
> If cat A catches the mouse first, print `Cat A`.
> If cat B catches the mouse first, print `Cat B`.
> If both cats reach the mouse at the same time, print `Mouse C`

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun catsAndMouse(input: List<Int>): String {
    val dis1 = (input[2] - input[0]).absoluteValue
    val dis2 = (input[2] - input[1]).absoluteValue
    return if (dis1 < dis2) "Cat A"
    else if (dis1 > dis2) "Cat B"
    else "Mouse C"
}
```

Calculate the distances, write a good if-else block.
