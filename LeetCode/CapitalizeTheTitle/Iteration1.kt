class Solution {
    fun capitalizeTitle(title: String): String {
        val words = title.split("""\s""".toRegex())
        val result = mutableListOf<String>()
        for (word in words) {
            if (word.length < 3) result += word.toLowerCase()
            else {
                var temp = word.toLowerCase()
                temp = temp.replaceFirst(word.first(), word.first().toUpperCase(), true)
                result += temp
            }
        }
        return result.joinToString(separator = " ")
    }
}