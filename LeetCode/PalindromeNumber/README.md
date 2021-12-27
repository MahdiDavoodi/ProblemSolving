# Palindrome Number

✅ Try to solve [this](https://leetcode.com/problems/palindrome-number/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> Given an integer x, return true if x is palindrome integer.
>
> An integer is a palindrome when it reads the same backward as forward.
>
> For example, 121 is a palindrome while 123 is not.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
class Solution {
    fun isPalindrome(number: Int): Boolean {
        val string = number.toString()
        val middle = (string.length - 1) / 2
        for (i in 0..middle) {
            if (string[i] != string[string.length - 1 - i] && string.length.rem(2) == 0) return false
            else if (string[i] != string[string.length - 1 - i] && string.length.rem(2) != 0 && i != middle) return false
        }
        return true
    }
}
```

☀️ Result:

> Runtime: 204 ms, faster than 77.40% of Kotlin online submissions for Palindrome Number.
>
> Memory Usage: 35.6 MB, less than 57.13% of Kotlin online submissions for Palindrome Number.
