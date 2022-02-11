fun main() {
    val string = readLine()!!
    val n = readLine()!!.toLong()
    println(string.numberOfChars('a', n))
}

fun String.numberOfChars(char: Char, n: Long): Long {
    var count = this.count { it == char }.toLong()
    count *= (n / this.length)
    return this.substring(0, (n % this.length).toInt()).count { it == char } + count
}

/**
 * Count the number of `a` in the given string.
 * Multiply it to the number of times the whole string is going to be considered.
 * Add the number of `a`s in the last string(The one that is not completed).
 * */