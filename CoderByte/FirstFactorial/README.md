# First Factorial

✅ Try to solve [this](https://coderbyte.com/editor/First%20Factorial:Kotlin) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on CoderByte.com

> Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
>
> For example: if num = 4, then your program should return 24.
>
> For the test cases, the range will be between 1 and 18 and the input will always be an integer.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
fun main() = println(factorial(readLine()!!.toInt()))

fun factorial(number: Int): Int {
    if (number <= 1) return 1
    return number * factorial(number - 1)
}
```

I solved this one with recursion :blush:. In fact, this is one of the most famous things, recursion can do for you. The logic behind it is pretty simple.

In a factorial, if we want to find the answer of `n!`, we can multiply the answer of `n - 1!` to `n`. That's the logic. We use previous answers to find the next ones. But you may ask, what is the first answer?

The first factorial is `1!` which equals `1`.
