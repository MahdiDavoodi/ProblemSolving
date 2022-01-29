class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false
        var number = n
        while (true) {
            if (number.rem(2) == 0) number /= 2
            else if (number.rem(3) == 0) number /= 3
            else if (number.rem(5) == 0) number /= 5
            else return number == 1
        }
    }
}
/**
 * Divide the number by 2,3,5 until it's not dividable.
 * If it equals to 1, return true. However, return false.
 * */