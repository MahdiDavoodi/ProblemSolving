class Solution {
    fun climbStairs(n: Int): Int {
        val array = IntArray(n) { -1 }
        return climb(n, array)
    }

    private fun climb(n: Int, array: IntArray): Int {
        if (n == 1) return 1
        if (n == 0) return 0
        if (n == 2) return 2
        if (array[n - 1] == -1) array[n - 1] = climb(n - 1, array)
        if (array[n - 2] == -1) array[n - 2] = climb(n - 2, array)
        return array[n - 2] + array[n - 1]
    }
}
// Bruh!