class Solution {
    fun thirdMax(numbers: IntArray): Int {
        val set = numbers.toSortedSet()
        return if (set.size >= 3) set.elementAt(set.size - 3) else set.elementAt(set.size - 1)
    }
}
/**
 * Remove all duplicates by converting your array to a sorted set.
 * If the length of the set is >= 3, return the third element from the end.
 * Else return the last element.
 * */