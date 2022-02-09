fun main() {
    val n = readLine()!!.toInt()
    val array = Array(n) { -1 }
    array[0] = 2
    n.liked(array)
    println(array.sum())
}

fun Int.liked(array: Array<Int>): Int {
    val x = this - 1
    return if (this <= 1) array.first()
    else if (array[x] != -1) array[x]
    else {
        array[x] = ((x).liked(array) * 3) / 2
        array[x]
    }
}

/**
 * This is not a good solution but it solves!
 * At first, I thought they want the `liked` count.
 * But they want the sum. So I print the sum of the array that holds liked values.
 * */