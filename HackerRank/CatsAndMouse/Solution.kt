import kotlin.math.absoluteValue

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        println(catsAndMouse(readLine()!!.split(" ").map { it.toInt() }))
    }
}

fun catsAndMouse(input: List<Int>): String {
    val dis1 = (input[2] - input[0]).absoluteValue
    val dis2 = (input[2] - input[1]).absoluteValue
    return if (dis1 < dis2) "Cat A"
    else if (dis1 > dis2) "Cat B"
    else "Mouse C"
}
