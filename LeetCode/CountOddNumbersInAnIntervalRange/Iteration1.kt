class Solution {
    fun countOdds(low: Int, high: Int): Int {
        return if (low.rem(2) == 0 && high.rem(2) == 0)
            (high - low) / 2
        else if (low.rem(2) != 0 && low.rem(2) != 0)
            (high - low) / 2 + 1
        else (high - low - 1) / 2 + 1
    }
}