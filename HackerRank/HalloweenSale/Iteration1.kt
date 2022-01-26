fun main() {
    val input = readLine()!!.trim().split(" ").map { x -> x.toInt() }
    println(howManyGames(input[0], input[1], input[2], input[3]))
}

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    if (s < p) return 0
    var current = s; var price = p; var count = 0
    while (price > m)
        if (current >= price) {
            current -= price
            count++
            price -= d
        } else break
    return if (price <= m && current >= price) count + (current / m)
    else count
}
/**
* It's easy to understand. 
*/