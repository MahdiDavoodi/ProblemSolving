class Solution {
    fun singleNumber(input: IntArray) = input.filter { x -> input.count { n -> n == x } == 1 }[0]
}

/**
 * Using filter, find the number that appears only once in the whole array.
 * Return it.
 * */