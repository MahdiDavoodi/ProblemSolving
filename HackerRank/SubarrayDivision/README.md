# Subarray Division

✅ Try to solve [this](https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
>
> Lily decides to share a contiguous segment of the bar selected such that:
>
> The length of the segment matches Ron's birth month, and,
> The sum of the integers on the squares is equal to his birthday.
> Determine how many ways she can divide the chocolate.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public static int birthday(List<Integer> list, int d, int m) {
    int n = list.size();
    int count = 0;
    for (int i = 0; i <= n - m; i++)
        if (n >= i + m)
            if (list.subList(i, i + m).stream().reduce(0, Integer::sum) == d)
                count++;
    return count;
}
```

> Java

First, you need to initiate a variable named `count` for counting the possible answers. Then, iterate through the array, and whenever you see a subarray that fulfills the criteria, `count++`.
