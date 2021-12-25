class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var index = 0
        var temp = 0
        var max = 0
        var container = s[index].toString()
        while (temp < s.length - 1) if (container.contains(s[temp + 1])) {
            if (max < container.length) max = container.length
            temp = ++index
            container = s[temp].toString()
        } else container = container.plus(s[++temp])
        return if (index == 0) s.length
        else return if (container.length > max) container.length
        else max
    }
}