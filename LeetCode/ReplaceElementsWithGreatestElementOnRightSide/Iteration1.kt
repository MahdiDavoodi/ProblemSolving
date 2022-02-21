class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for (index in arr.size - 1 downTo 0){
            val temp = arr[index]
            arr[index] = max
            max = maxOf(temp,max)
        }
        return arr
    }
}