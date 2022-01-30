class Solution {
    fun productExceptSelf(numbers: IntArray): IntArray {
        val tempPre = IntArray(numbers.size)
        val tempPost = IntArray(numbers.size)
        tempPre[0] = 1
        for (i in 1 until tempPre.size) tempPre[i] = numbers[i - 1] * tempPre[i - 1]
        tempPost[tempPost.size - 1] = 1
        for (i in tempPost.size - 2 downTo 0) tempPost[i] = numbers[i + 1] * tempPost[i + 1]
        return tempPost.mapIndexed { index, i -> i * tempPre[index] }.toIntArray()
    }
}

/**
 * Calculate all the products before each number and store them in an array.
 * Do the same, but this time for products after each element.
 * Multiply all same positions in post and pre-products array.
 * */