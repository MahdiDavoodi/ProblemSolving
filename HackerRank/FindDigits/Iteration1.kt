fun main() {
    val cases = readLine()!!.toInt()
    repeat(cases) {
        println(readLine()!!.toInt().numberOfDivisors())
    }
}

fun Int.numberOfDivisors(): Int {
    var count = 0
    for (ch in this.toString()) {
        val temp = ch.toString().toInt() // Use `ch.digitToInt()` in higher version.
        if (temp != 0 && this.rem(temp) == 0) count++
    }
    return count
}

/**
 * Convert the given integer to string.
 * Iterate through that string and for each character, check if it's a divisor of the integer.
 * If it is, `count++`.
 * */