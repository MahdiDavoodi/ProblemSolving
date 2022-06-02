# Solution

My first approach was to go brute force. It failed to pass all the test cases because of the time limit.

```kotlin
class Solution {
    fun groupAnagrams(strings: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        var added = false
        for (str in strings) {
            for (i in result) {
                if (i.first().toList().sorted() == str.toList().sorted()) {
                    i.add(str)
                    added = true
                    break
                }
            }
            if (added) added = false
            else result.add(mutableListOf(str))
        }
        return result
    }
}
```

The behavior of this code is pretty obvious. However, I've found the same version of my solution but in a functional style in Kotlin. This solution was helpful and it passed the time limit cases.

```kotlin
class Solution {
    fun groupAnagrams(strings: Array<String>): List<List<String>> = strings.groupBy {it.toCharArray().sorted()}.values.toList()
}
```
