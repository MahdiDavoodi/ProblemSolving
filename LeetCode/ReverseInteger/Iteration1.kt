class Solution {
    fun reverse(x: Int): Int {
        var string = x.toString().reversed()
        if (string.last() == '-')
            string = "-" + string.substring(0, string.length - 1)
        val temp = string.toLong()
        return if (temp > Int.MAX_VALUE || temp < Int.MIN_VALUE) 0
        else temp.toInt()
    }
}

/**
 * Yeah, it's the worst possible way.
 * And also, not acceptable by the rules of the problem.
 * */