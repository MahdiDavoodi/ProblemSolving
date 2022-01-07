# Drawing Book

✅ Try to solve [this](https://www.hackerrank.com/challenges/drawing-book/problem) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or the back of the book. They always turn pages one at a time. When they open the book, page `1` is always on the right side:
>
> When they flip page `1`, they see pages `2` and `3`. Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is `n` pages long, and a student wants to turn to page `p`, what is the minimum number of pages to turn? They can start at the beginning of the end of the book.
> Given `n` and `p`, find and print the minimum number of pages that must be turned in to arrive at page `p`.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
private static int getPage(int length, int target) {
        if (length / 2 >= target)
            return target / 2;
        else if (length == target)
            return 0;
        else {
            int result = (length - target) / 2;
            if (result == 0 && length % 2 == 0) return 1;
            else return result;
        }
    }
```

Simple if-else logic is more than enough to solve this problem. You need to find the shortest way to reach the target page. You need to find the half that your target page is located on. Then implement some conditions for odd or even length inputs of the book.
