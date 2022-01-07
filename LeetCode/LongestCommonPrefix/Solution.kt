class Solution {
    fun longestCommonPrefix(input: Array<String>): String {
      input.sort()
        val a = input[input.size - 1]
        var prefix = ""
        input[0].forEachIndexed { index, c -> if (c == a[index]) prefix += c else return prefix }
        return prefix
    }
}
