class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        var maxProf = 0
        for (i in prices) {
            if (i < min) {
                min = i
                max = i
            } else if (i > max) max = i
            if (max - min > maxProf) maxProf = max - min
        }
        return maxProf
    }
}

/*
Iterate through the array. In each iteration:
    - Update `max` and `min` variables if it's needed.
    - If you updated the min value, you should set that same value to the max value       because we need to start a new search for the max value.
    - Keep track of the maximum profit.
*/
