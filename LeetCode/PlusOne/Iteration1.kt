class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0
                if (i == 0)
                    return intArrayOf(1).plus(digits)
            } else {
                digits[i]++
                break
            }
        }
        return digits
    }
}
/**
 * Iterate through the array starting at the end.
 * */