import kotlin.math.abs

class Solution {
    fun reformat(s: String): String {
        val chars = mutableListOf<Char>()
        val digits = mutableListOf<Int>()
        for (i in s) {
            if (i in 'a'..'z')
                chars.add(i)
            else
                digits.add(i.toString().toInt())
        }
        return if (abs(chars.size - digits.size) > 1) ""
        else {
            var string = ""
            if (chars.size > digits.size) {
                for (i in chars.indices) {
                    string += chars[i]
                    if (i < digits.size)
                        string += digits[i]
                }
            } else {
                for (i in digits.indices) {
                    string += digits[i]
                    if (i < chars.size)
                        string += chars[i]
                }
            }
            return string
        }
    }
}

/**
 * At this point, I just care about the fact that I solved it.
 * Don't even want to think about complexity and shit.
 * Also, I used `digitToInt()`. But their Kotlin's version is lower.
 * */