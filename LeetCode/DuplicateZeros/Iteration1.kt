class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        val list = mutableListOf<Int>()

        for (i in arr) {
            list.add(i)
            if (i == 0) list.add(i)
            if(list.size > arr.size) break
        }

        for (i in arr.indices) arr[i] = list[i]
    }
}

/*
* Make a list that satisfies the conditions.
* Copy that list into your array!
* */