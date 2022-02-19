class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val map = HashMap<Char, Int>()
        for (index in word1.indices) {
            if (word1[index] == word2[index]) continue
            map[word1[index]] = map[word1[index]]?.plus(1) ?: 1
            map[word2[index]] = map[word2[index]]?.minus(1) ?: -1
        }
        return map.values.count { x -> x > 3 || x < -3 } == 0
    }
}

/**
 * I used a map to store the characters and their appearance counts.
 * For each appearance in the first word, add one to the count, for each appearance in the second word, minus one from the count.
 * If the total sum of their appearance is bigger than 3 or smaller than -3, these two strings are not AlmostEquivalent.
 * */