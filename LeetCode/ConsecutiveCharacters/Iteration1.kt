class Solution {
    fun maxPower(s: String): Int {
        var c: Char? = null
        if (s.isEmpty()) return 0
        var max = 1 ; var count = 0

        for (ch in s) {
            if (c == ch) count++
            else {
                max = maxOf(max, count)
                c = ch
                count = 1
            }
        }
        return maxOf(max, count)
    }
}