fun main() {
    readLine()
    println(readLine()!! cipher readLine()!!.toInt())
}

infix fun String.cipher(key: Int): String {
    return if (key > 26) this.cipher(key % 26)
    else this.map {
        if (it.isLetter()) {
            val temp = (it.toInt() + key) // Use it.code in higher versions
            when {
                it.isLowerCase() && temp > 122 -> (temp - 26).toChar()
                it.isUpperCase() && temp > 90 -> (temp - 26).toChar()
                else -> temp.toChar()
            }
        } else it
    }.joinToString("", "", "")
}
/**
If the key is bigger than 26, we are going to meet the same spot. 
For example, if they give you 87 as the key and you have to find the replacement for `w`, you don't need to waste your time and iterate through the alphabet multiple times. Instead, consider your key as (key % 26).

The rest of my solution is pretty clear since this is an easy problem.
*/