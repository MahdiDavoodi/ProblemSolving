# Valid Parentheses

✅ Try to solve [this](https://leetcode.com/problems/valid-parentheses/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
>
> An input string is valid if:
>
> Open brackets must be closed by the same type of brackets.
> Open brackets must be closed in the correct order.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
import java.util.*
import kotlin.math.absoluteValue

class Solution {
    fun isValid(s: String): Boolean {
        if (s.length.rem(2) != 0 || s.isEmpty()) return false
        val stack = Stack<Char>()
        var dif = 0
        s.forEach {
            if (!stack.isEmpty()) {
                dif = (it - stack.lastElement())
                if (dif == 2 || dif == 1) {
                    stack.pop()
                } else {
                    stack.push(it)
                }
            } else {
                stack.push(it)
            }
        }
        return stack.size == 0
    }
}
```

☀️ Result:

> Runtime: 140 ms, faster than 83.21% of Kotlin online submissions for Valid Parentheses.
>
> Memory Usage: 33.4 MB, less than 94.61% of Kotlin online submissions for Valid Parentheses.
