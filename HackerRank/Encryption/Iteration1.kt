import kotlin.math.*

fun main() {
    val input = readLine() ?: ""
    val column = ceil(sqrt(input.length.toDouble())).toInt()

    val array = Array(column) { "" }
    var count = 0
    for (c in input) {
        if (count == column) count = 0
        array[count] += c.toString()
        count++
    }

    println(array.joinToString(" "))
}

/**
 * Iteration 1 - My way
 * Instead of creating a grid, you can just iterate through the string once.
 * Keep track of columns and store the output in an array.
 * */