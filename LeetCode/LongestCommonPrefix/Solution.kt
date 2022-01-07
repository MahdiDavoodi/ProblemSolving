class Solution {
    fun longestCommonPrefix(input: Array<String>): String {
        val shortest = input.minByOrNull { it.length }
        var prefix = ""
        shortest?.forEachIndexed { index, char ->
            if (commonChar(input, index, char) == input.size)
                prefix += char
            else return prefix
        }
        return prefix
    }

    private fun commonChar(input: Array<String>, index: Int, char: Char): Int = input.count { it[index] == char }
}

fun main() {
    val solution = Solution()
    val array = arrayOf("hell", "helina", "hello", "helen")
    println(solution.longestCommonPrefix(array))
}
