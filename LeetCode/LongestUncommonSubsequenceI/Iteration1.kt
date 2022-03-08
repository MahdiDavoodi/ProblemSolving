class Solution {
    fun findLUSlength(a: String, b: String) = if (a == b) -1 else maxOf(a.length, b.length)
}
/**
 * If strings are equal, return -1.
 * Otherwise, the length of the bigger one is the longest uncommon subsequence.
 * */