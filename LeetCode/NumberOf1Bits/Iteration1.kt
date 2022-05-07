class Solution {
    fun hammingWeight(n:Int):Int {
        return Integer.toBinaryString(n).count { it == '1' }
    }
}
/*
* Using the Integer class from Java, you can convert an integer into its binary form.
* */