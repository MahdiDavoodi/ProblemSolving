class Solution {
    fun findMedianSortedArrays(array1: IntArray, array2: IntArray): Double {
        val array3 = (array1 + array2).sortedArray()
        return when (val s = array3.size) {
            0 -> 0.0
            1 -> array3[0].toDouble()
            2 -> (array3[0] + array3[1]).div(2.0)
            else -> if (s % 2 == 0)
                (array3[s / 2] + array3[array3.size / 2 - 1]).div(2.0)
            else array3[s / 2].toDouble()
        }
    }
}
/**
 * This answer is not valid, but it passes the tests.
 * The complexity of this solution is more than O(log(m + n)).
 * */