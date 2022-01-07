import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val list = ArrayList<Int>(); val scanner = Scanner(System.`in`); val n = scanner.nextInt()
    for (i in 1..n)
        list.add(scanner.nextInt())
    var max = Int.MIN_VALUE; var min = Int.MAX_VALUE; var recordPlus = 0; var recordMinus = 0
    list.forEach {
        if (it > max) {
            max = it
            recordPlus++
        }
        if (it < min) {
            min = it
            recordMinus++
        }
    }
    println("${--recordPlus} ${--recordMinus}")
}
