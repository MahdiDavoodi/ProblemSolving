class Solution {
    fun isPalindrome(number: Int): Boolean {
        val string = number.toString()
        val middle = (string.length - 1) / 2
        for (i in 0..middle) {
            if (string[i] != string[string.length - 1 - i] && string.length.rem(2) == 0) return false
            else if (string[i] != string[string.length - 1 - i] && string.length.rem(2) != 0 && i != middle) return false
        }
        return true
    }
}