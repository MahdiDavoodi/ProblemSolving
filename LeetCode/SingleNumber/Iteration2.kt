class Solution {
    fun singleNumber(input: IntArray): Int {
        var result = 0
        for (i in input) result = result.xor(i)
        return result
    }
}

/**
 * Using xor operation on bits of every number.
 * You can find the number that only appears once.
 * It's because once result is set to that number, it's not gonna change again.
 * */