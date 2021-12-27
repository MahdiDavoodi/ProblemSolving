import java.util.*
import kotlin.math.absoluteValue

class Solution {
    fun isValid(s: String): Boolean {
        if (s.length.rem(2) != 0 || s.isEmpty()) return false
        val stack = Stack<Char>()
        var dif = 0
        s.forEach {
            if (!stack.isEmpty()) {
                dif = (it - stack.lastElement())
                if (dif == 2 || dif == 1) {
                    stack.pop()
                } else {
                    stack.push(it)
                }
            } else {
                stack.push(it)
            }
        }
        return stack.size == 0
    }
}