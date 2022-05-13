class Solution {
    fun majorityElement(nums: IntArray): Int {
        val x = nums.size / 2; var count = 0
        var temp: Int? = null

        nums.sort()
        for (i in nums)
            if (i == temp) {
                count++
                if (count > x) return temp
            } else {
                count = 1
                temp = i
            }
        return temp!!
    }
}

/*
* Sort the array, find the first element that has more than (nums.size / 2) appearance in the array.
* Return it!
* */