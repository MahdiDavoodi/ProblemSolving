import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val alphabet = mutableMapOf<Char, Int>()
    for ((counter, height) in h.withIndex()) alphabet[(counter + 97).toChar()] = height
    var biggestChar = 'a'
    var max = Int.MIN_VALUE
    for (ch in word) if (alphabet[ch]!! > max) {
        max = alphabet[ch]!!
        biggestChar = ch
    }
    return alphabet[biggestChar]?.times(word.length) ?: 0
}

fun main() = println(
    designerPdfViewer(
        readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray(), readLine()!!
    )
)
