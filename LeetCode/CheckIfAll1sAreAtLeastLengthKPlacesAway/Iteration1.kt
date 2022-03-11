class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var d = 0
        for (i in nums) if (i == 1) {
            if (d <= 0) d = k
            else return false
        } else d--
        return true
    }
}
/**
 * A solid iteration through the array with a simple counter for the distance between `1`s.
 * */