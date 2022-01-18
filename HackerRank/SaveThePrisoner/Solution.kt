import kotlin.io.*
import kotlin.text.*

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return if (n == m) if (s == 1) n
    else s - 1
    else {
        val result = (m + s - 1) % n
        if (result == 0) n
        else result
    }
}

fun main() = repeat(
    readLine()!!.trim().toInt()
) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")
    println(
        saveThePrisoner(
            firstMultipleInput[0].toInt(),
            firstMultipleInput[1].toInt(),
            firstMultipleInput[2].toInt()
        )
    )
}
