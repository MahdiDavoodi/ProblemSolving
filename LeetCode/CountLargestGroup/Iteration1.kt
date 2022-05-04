class Solution {
    fun countLargestGroup(n: Int): Int {
        var largest = 0
        val map = mutableMapOf<Int, Int>()
        for (i in 1..n) {
            val temp = if(i < 10) i
            else i.toString().toCharArray().map{ it.toString().toInt() }.sum()
            if (temp in map)
                map[temp] = map[temp]!! + 1
            else map += temp to 1
            if (largest < map[temp]!!) largest = map[temp]!!
        }
        return map.count { it.value == largest }
    }
}

/*
* LeetCode must update their Kotlin version!
* Using a map, solving this problem is pretty easy.
* */