class Solution {
    fun thirdMax(numbers: IntArray): Int {
        var max: Int? = null ; var secondMax: Int? = null ; var thirdMax: Int? = null
        for (it in numbers) {
            if (it == max || it == secondMax || it == thirdMax) continue
            if (max == null || max < it) {
                thirdMax = secondMax
                secondMax = max
                max = it
            } else if (secondMax == null || secondMax < it) {
                thirdMax = secondMax
                secondMax = it
            } else if (thirdMax == null || thirdMax < it) thirdMax = it
        }
        return thirdMax ?: max!!
    }
}
/**
 * Solved with common sense. O(n)
 * */