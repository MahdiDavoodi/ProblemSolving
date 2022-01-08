# The Hurdle Race

✅ Try to solve [this](https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by `1` unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return `0`.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine().trim().split(" ")[1]);
        Optional<Integer> max = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt).max(Integer::compareTo);
        if (max.isPresent() && max.get() > k)
            System.out.println(max.get() - k);
        else System.out.println(0);
        scanner.close();
    }
}
```

Using a functional approach, I used streams to find the maximum value of the hurdles. After that, you only need to compare the max value and the character's power to jump. If the max is bigger, print out `max - k`. Otherwise, print out `0`.
