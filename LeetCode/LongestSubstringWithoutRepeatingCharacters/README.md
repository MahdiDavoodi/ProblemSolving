# Longest Substring Without Repeating Characters

✅ Try to solve [this](https://leetcode.com/problems/longest-substring-without-repeating-characters/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> Given a string s, find the length of the longest substring without repeating characters.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var index = 0
        var temp = 0
        var max = 0
        var container = s[index].toString()
        while (temp < s.length - 1) if (container.contains(s[temp + 1])) {
            if (max < container.length) max = container.length
            temp = ++index
            container = s[temp].toString()
        } else container = container.plus(s[++temp])
        return if (index == 0) s.length
        else return if (container.length > max) container.length
        else max
    }
}
```

☀️ Result:

> Runtime: 472 ms, faster than 14.42% of Kotlin online submissions for Longest Substring Without Repeating Characters.
>
> Memory Usage: 37.3 MB, less than 41.07% of Kotlin online submissions for Longest Substring Without Repeating Characters.
