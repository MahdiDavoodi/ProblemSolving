class Solution {
    fun containsDuplicate(nums: IntArray) = nums.toSet().size != nums.size
}
/*
* Convert the array to a set to remove the duplicates.
* If the size remains the same, the array does not include any duplicate and therefore returns false.
* Otherwise, returns true.
*/