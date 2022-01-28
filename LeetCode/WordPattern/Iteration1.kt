import kotlin.collections.HashMap

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val array = s.split(" ")
        if (pattern.length != array.size) return false
        val hashmap = HashMap<Char, String>()
        for (i in array.indices) {
            if (hashmap.contains(pattern[i])) {
                if (hashmap[pattern[i]] != array[i]) return false
            } else if (!hashmap.values.contains(array[i]))
                hashmap[pattern[i]] = array[i]
            else return false
        }
        return true
    }
}

/**
 * If the number of the words and chars in pattern are not equal, return false.
 * Else create a map to have something to save checked chars and words in it.
 * It is a map because you need to create connection between words and chars.
 * */