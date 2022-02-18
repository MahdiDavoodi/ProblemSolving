import kotlin.math.abs

class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val array = IntArray(s.length) { 0 }
        val indices = mutableListOf<Int>()
        for (index in s.indices) if (s[index] == c) indices += index
        for (index in s.indices) array[index] = abs(index - (indices.minBy { abs(index - it) } ?: 0))
        return array
    }
}

/**
 * This is the worst possible way to solve this problem.
 * Don't forget to use `minByOrNull` instead. LeetCode currently uses an older version of Kotlin.
 * */