class MinStack() {

    var list: MutableList<Int> = mutableListOf<Int>()

    fun push(v: Int) = list.add(v)

    fun pop() = list.removeAt(list.size - 1)

    fun top() = list.last()

    fun getMin() = list.minBy { it } ?: 0
}