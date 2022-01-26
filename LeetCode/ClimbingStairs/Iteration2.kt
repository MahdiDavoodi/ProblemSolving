class Solution {
    fun climbStairs(n: Int): Int {
        var answers = Array(n + 2) { it }
        for (i in 3 until answers.size) answers[i] = answers[i - 2] + answers[i - 1]
        return answers[n]
    }
}
/**
 * Just like the last iteration.
 * Only this time, we use dynamic programming a little better.
 * Since this problem is very close to fibonacci, then we act like we are dealing with fibonacci.
 * */