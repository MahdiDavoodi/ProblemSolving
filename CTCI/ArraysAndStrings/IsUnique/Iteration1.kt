fun main() {
    println("test".allUnique())
    println("test".allUnique2())
    println("abc".allUnique2())
    println("abc".allUnique())
}

// Solution 1:

fun String.allUnique() = this.toSet().size == this.length

// Solution 2 - Without using any data structure:

fun String.allUnique2(): Boolean {
    for (i in this.indices) {
        for (j in (i + 1) until this.length) {
            if (this[i] == this[j]) return false
        }
    }
    return true
}