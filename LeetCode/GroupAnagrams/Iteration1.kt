class Solution {
    fun groupAnagrams(strings: Array<String>): List<List<String>> = strings.groupBy {it.toCharArray().sorted()}.values.toList()
}