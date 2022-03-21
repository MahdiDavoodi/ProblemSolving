fun main() {
    repeat(readLine()?.toInt() ?: 0) {
        readLine()
        val input = readLine()?.trim()?.split(' ')?.map { x -> x.toInt() }?.toIntArray() ?: intArrayOf(0)
        println(isThere(input))
    }
}

fun isThere(array: IntArray): String {
    val temp = IntArray(array.size)
    var sum = 0
    for (i in array.indices) {
        temp[i] = sum
        sum += array[i]
    }

    sum = 0
    for (i in array.size - 1 downTo 0) {
        if (sum == temp[i]) return "YES"
        sum += array[i]
    }

    return "NO"
}

/**
 * Create two arrays, and fill them with the sum from left to right and right to left.
 * If there is any equal element is the same index in both arrays, return yes. else return no.
 * This answer is simpler since I only considered one array.
 * */