class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sortDescending() ; s.sortDescending()
        val list = s.toMutableList()
        var temp:Int ; var count = 0
        for(child in g){
            if(list.isEmpty()) return count
            temp = list[0]
            if(temp >= child) {
                count++
                list.removeAt(0)
            }
        }
        return count
    }
}

/*
* Sort both arrays in descending order.
* If there is a cookie that satisfies a kid, give it to him and count it.
* return the count.
* */