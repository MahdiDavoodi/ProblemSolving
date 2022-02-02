class Solution {
    fun reverse(x: Int): Int {
        val x1 = x.rev()
        return if (x % 10 == 0) x1;
        else {
            val x2 = x1.rev()
            if (x2 == x) x1 else 0
        }
    }

    private fun Int.rev(): Int {
        var number = this
        var reversed = 0
        while (number != 0) {
            reversed = (reversed * 10) + number % 10
            number /= 10
        }
        return reversed
    }
}

/**
 * Instead of preventing the overflow, let it happen. And then do something about it.
 * This is not optimized since I'm calling the reverse function 2 times.
 * */