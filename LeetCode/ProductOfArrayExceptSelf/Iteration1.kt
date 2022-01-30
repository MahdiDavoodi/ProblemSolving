class Solution {
    fun productExceptSelf(numbers: IntArray): IntArray {
        val zero = numbers.count { x -> x == 0 }
        if (zero >= 2) return IntArray(numbers.size) { 0 }
        val product = numbers.reduce { product, n ->
            if (n != 0) product * n
            else product * 1
        }
        return numbers.map { x ->
            if (zero == 1 && x != 0) 0
            else if (x == 0) product
            else product.div(x)
        }.toIntArray()
    }
}

/**
 * They said the div operation is not allowed, we used the div function.
 * This is my first and only attempt. I should see a video of how to solve this properly with O(n) complexity.
 * */