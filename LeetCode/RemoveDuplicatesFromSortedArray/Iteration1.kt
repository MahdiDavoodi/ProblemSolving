class Solution {
    fun removeDuplicates(numbers: IntArray): Int {
        val mySet = numbers.toSortedSet()
        for (i in mySet.indices) numbers[i] = mySet.elementAt(i)
        return mySet.size
    }
}
/*
Convert your array into a set. Copy your set to your array.
Return the size of your set.
*/
