fun main() {
    val returnDate = readLine()?.split(' ')?.map { x -> x.toInt() } ?: listOf(0, 0, 0)
    val expectedDate = readLine()?.split(' ')?.map { x -> x.toInt() } ?: listOf(0, 0, 0)
    println(calculateFine(returnDate, expectedDate))
}

fun calculateFine(
    returned: List<Int>,
    expected: List<Int>
) = if (returned[2] == expected[2])
    if (returned[1] == expected[1])
        if (returned[0] <= expected[0]) 0
        else 15 * (returned[0] - expected[0])
    else if (returned[1] < expected[1]) 0
    else 500 * (returned[1] - expected[1])
else if (returned[2] < expected[2]) 0
else 10000

/**
 * A simple chained if else expressions.
 * */