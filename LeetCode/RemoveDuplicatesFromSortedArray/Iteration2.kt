class Solution {
    fun removeDuplicates(numbers: IntArray): Int {
        if (numbers.size <= 1) return numbers.size
        var temp = numbers[0]
        var k = 1
        for (i in 1 until numbers.size) if (numbers[i] != temp) {
            temp = numbers[i]
            numbers[k] = temp
            k++
        }
        return k
    }
}
/*
Use two pointers. One of them is pointing at your imaginary new array which is stored in the main array.
The other one helps you to iterate through the main array and ignore all duplicates value while copying elements into your new array.
*/
