fun biggerIsGreater(w: String): String {
    var str = w.toCharArray().toMutableList()
    if (w.length < 2) return "no answer"
    for (i in str.size - 2 downTo 0) {
        if (str[i] < str[i + 1]) {
            val ch = str[i]
            val cutFrom = i + 1
            val rest = str.subList(cutFrom, str.size)
            val minBigger = rest.minByIndex(ch)
            if (minBigger != null) {
                str[i] = minBigger.first
                str[minBigger.second + cutFrom] = ch
                val temp = str.subList(cutFrom, str.size).sorted()
                str = str.dropLast(temp.size).toMutableList()
                str.addAll(cutFrom, temp)
                return str.joinToString("")
            }
        }
    }
    return "no answer"
}

fun List<Char>.minByIndex(element: Char): Pair<Char, Int>? {
    var min = Pair('z', 0)
    var flag = false
    for (i in this.indices) if (this[i] > element && this[i] < min.first) {
        min = Pair(this[i], i)
        flag = true
    }
    return if (flag) min else null
}

fun main() {
    val n = readLine()!!.toInt()
    for (TItr in 1..n) {
        val w = readLine()!!.trim()
        println(biggerIsGreater(w))
    }
}

/*
* For each word, start from the end.
* Find the first character that is bigger than the previous one. If you can't, return no answer.
* After that, find the smallest biggest character after the character you found.
* Swap them. Sort the rest of the string.
* */