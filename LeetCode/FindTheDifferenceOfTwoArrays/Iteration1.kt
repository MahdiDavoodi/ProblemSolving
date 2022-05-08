class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var set1 = mutableSetOf<Int>()
        var set2 = mutableSetOf<Int>()
        
        for(i in nums1)if(i !in nums2) set1.add(i)
        for(i in nums2)if(i !in nums1) set2.add(i)
        
        return listOf(set1.toList(),set2.toList())
    }
}

/*
* O(n)2
* Iterate over arrays, find the ones that are not in common, add them to seperate sets.
*/