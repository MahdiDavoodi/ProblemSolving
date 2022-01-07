# Longest Common Prefix

✅ Try to solve [this](https://leetcode.com/problems/longest-common-prefix) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> Write a function to find the longest common prefix string amongst an array of strings.
>
> If there is no common prefix, return an empty string "".

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```kotlin
class Solution {
    fun longestCommonPrefix(input: Array<String>): String {
        val shortest = input.minByOrNull { it.length }
        var prefix = ""
        shortest?.forEachIndexed { index, char ->
            if (commonChar(input, index, char) == input.size)
                prefix += char
            else return prefix
        }
        return prefix
    }

    private fun commonChar(input: Array<String>, index: Int, char: Char): Int = input.count { it[index] == char }
}
```
I probably have the most ridiculous first attempts in the world. This is one of them. The code is pretty understandable. Yet, The logic is questionable. But hey, It works!

☀️ Result:

> Runtime: 188 ms, faster than 49.37% of Kotlin online submissions for Longest Common Prefix.
>
> Memory Usage: 36.4 MB, less than 43.24% of Kotlin online submissions for Longest Common Prefix.
