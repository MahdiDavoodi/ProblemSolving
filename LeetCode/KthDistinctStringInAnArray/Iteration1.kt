class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = mutableMapOf<String, Int>()
        for (str in arr) {
            if (str in map) map[str] = map[str]!! + 1
            else map += str to 1
        }
        var x = k
        for ((str, n) in map)
            if (n == 1) {
                if (x == 1) return str ; x--
            }
        return ""
    }
}

/*
* Using a map, count the appearance of each string.
* The rest of it is just a walk in the park.
*/