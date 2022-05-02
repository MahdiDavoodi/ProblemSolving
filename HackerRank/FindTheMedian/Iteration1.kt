import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    return arr[arr.size / 2]
}

fun main() {
    readLine()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = findMedian(arr)
    println(result)
}
/*
* Sort the array, return the middle element!
* */