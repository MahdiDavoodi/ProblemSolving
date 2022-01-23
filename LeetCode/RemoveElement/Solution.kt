class Solution {
    fun removeElement(numbers: IntArray, n: Int): Int {
        var k = 0
        for (i in numbers.indices) if (numbers[i] != n) {
            numbers[k] = numbers[i]
            k++
        }
        return k
    }
}
/*
Iterate through the array using two pointers. One of them is pointing at your new array.
The other one is pointing at your current one. Copy all the numbers except those that are equal to n.
*/