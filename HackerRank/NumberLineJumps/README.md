# Number Line Jumps

✅ Try to solve [this](https://www.hackerrank.com/challenges/kangaroo/problem) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
>
> The first kangaroo starts at location `x1` and moves at a rate of `v1` meters per jump. The second kangaroo starts at location `x2` and moves at a rate of `v2` meters per jump. You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return `YES`, otherwise return `NO`.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public static String kangaroo(int x1, int v1, int x2, int v2) {
    if (v1 == v2 && x1 != x2) return "NO";
    int steps = (x2 - x1) / (v1 - v2);
    if (steps >= 0 && x1 + (v1 * steps) == x2 + (v2 * steps))
        return "YES";
    else return "NO";
  }
```

The logic behind this answer is pretty good to understand. If those two kangaroos need to see each other in the same exact point with the same amount of steps, we will have an equation like this: `x1 + (steps * v1) = x2 + (steps * v2)`. Since we get four of those values from the input, we only need to find the number of steps needed for kangaroos to meet each other.

So we have to convert that equation to this: `steps = (x2 - x1) / (v1 - v2)`. Since we don't want to see exceptions, we have to prevent the possibility of division by zero.

If the `steps` is a positive number and putting it into the first equation makes sense, kangaroos are going to meet each other!
