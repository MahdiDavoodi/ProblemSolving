import kotlin.math.abs

fun main() = repeat(readLine()!!.toInt()) {
    println(if (readLine()!!.isFunny()) "Funny" else "Not Funny")
}

fun String.isFunny(): Boolean {
    val n = this.length - 1
    for (i in 0 until n)
        if (abs(this[i] - this[i + 1]) != abs(this[n - i] - this[n - i - 1]))
            return false
    return true
}

/**
 * Iterate through the string just for once.
 * In each iteration, check if the difference of 2 indices from `string` is equal to `string.reversed()`
 * If the differences are equal, continue.
 * If not return false.
 * */