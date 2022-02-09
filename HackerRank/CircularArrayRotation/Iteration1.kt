import java.util.LinkedList

fun main() {
    val inputs = readLine()!!.split(" ").map { x -> x.toInt() }
    val list = LinkedList(readLine()!!.split(" ").map { x -> x.toInt() })
    repeat(inputs[1]) {
        list.addFirst(list.removeLast())
    }
    repeat(inputs[2]) {
        println(list[readLine()!!.toInt()])
    }
}

/**
 * I love linked lists.
 * Remove from the end, add to the first.
 * All other elements will have their new position without you even touching them.
 * */