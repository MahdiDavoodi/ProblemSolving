class Solution {
    fun isPalindrome(s: String): Boolean {
        val string = s.filter { it.isLetterOrDigit() }.map { it.toLowerCase() }
        return string == string.reversed()
    }
}
/**
 * I will write my two pointer solution for the next iteration.
 * This is not fast, but solves and that's enough for now.
 * */