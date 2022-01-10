import kotlin.math.absoluteValue

fun main() {
    val n = readLine()!!.toInt() - 1
    val list = ArrayList<List<Int>>()
    for (i in 0..n)
        list.add(readLine()!!.trim().split(" ").map { x -> x.toInt() }.toList())
    var a = 0; var b = 0
    for ((j, i) in (n downTo 0).withIndex()) {
        a += list[i][i]
        b += list[j][i]
    }
    println("${(a - b).absoluteValue}")
}
