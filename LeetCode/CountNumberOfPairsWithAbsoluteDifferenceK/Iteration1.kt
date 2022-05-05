class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var result = 0
        for(i in nums.indices){
            for(j in (i + 1)..(nums.size - 1)){
                if(kotlin.math.abs(nums[i] - nums[j]) == k) result++
            }
        }
        return result
    }
}
/*
* Another simple problem solved using a nested loop!
*/