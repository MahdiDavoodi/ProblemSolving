class Solution {
    fun maxSubArray(numbers: IntArray): Int {
        var sum = numbers[0]
        var maxSum = sum
        for (i in numbers.drop(1)) {
            sum = maxOf(i, i + sum)
            maxSum = if (sum > maxSum) sum else maxSum
        }
        return maxSum
    }
}

/*
  Got help from this amazing video:
      https://www.youtube.com/watch?v=2MmGzdiKR9Y
  My first solution had O(n^3) complexity. It was a simple brute force
*/
