import kotlin.math.max as maxOf

class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        var max = -1
        for (i in 0..s.length - 2)
            for (j in s.length - 1 downTo i + 1) {
                if (s[j] == s[i])
                    max = maxOf(s.substring(i + 1, j).length, max)
            }
        return max
    }
}

/**
 * Define a variable named `max` and initialize it with -1.
 * Iterate through the string and for each character, find the duplicates with another loop.
 * If there is a duplicate, get the length of the substring between them.
 * If its length is bigger than max, update max with this new value.
 * */