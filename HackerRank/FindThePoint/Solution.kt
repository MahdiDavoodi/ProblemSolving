fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val array = readLine()!!.trim().split(" ").map { x -> x.toInt() }.toList()
        println(reflection(array))
    }
}

fun reflection(array: List<Int>): String {
    val x = (array[2] - array[0]) + array[2]
    val y = (array[3] - array[1]) + array[3]
    return "$x $y"
}
