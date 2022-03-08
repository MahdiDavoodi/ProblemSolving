class Solution {
    fun moveZeroes(array: IntArray) {
        var newArrayIndex = 0
        for (i in array.indices) if (array[i] != 0) {
            val temp = array[newArrayIndex]
            array[newArrayIndex] = array[i]
            array[i] = temp
            newArrayIndex++
        }
    }
}
/**
 * Solve this problem using the second new array.
 * It's very easy, since you only need to copy the non-zero numbers in the beginning.
 * But question says you should not use a new array.
 * So you can consider a new array, inside the current array. (newArrayIndex)
 * */