class Solution {
    fun thousandSeparator(n: Int) = "%,d".format(n).replace(",",".")
}
/*
* Using format method on string object.
*/