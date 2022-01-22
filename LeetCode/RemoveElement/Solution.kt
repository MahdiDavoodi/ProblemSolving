class Solution {
    fun removeElement(numbers: IntArray, n: Int): Int {
        val list = numbers.toMutableList()
        list.removeAll { x -> x == n }
        for (i in list.indices) numbers[i] = list[i]
        return list.size
    }
}

/*
First, convert it to a mutable list. Then remove all the duplicates. Copy the entire list to the first `list.size` elements of `nums`.

Return `list.size` 
*/