import java.util.*

class Solution {
    fun merge(numbers1: IntArray?, m: Int, numbers2: IntArray?, n: Int) {
        System.arraycopy(numbers2, 0, numbers1, m, n)
        Arrays.sort(numbers1)
    }
}
