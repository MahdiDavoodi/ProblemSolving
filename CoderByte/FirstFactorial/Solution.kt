fun main() = println(factorial(readLine()!!.toInt()))

fun factorial(number: Int): Int {
    if (number <= 1) return 1
    return number * factorial(number - 1)
}
