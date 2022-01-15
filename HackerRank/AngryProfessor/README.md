# Angry Professor

✅ Try to solve [this](https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel the class if fewer than some number of students are present when class starts. Arrival times go from on time to arrive late.
>
> Given the arrival time of each student and a threshold number of attendees, determine if the class is canceled.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim().split(" ")[1]);
            long students = Arrays.stream(scanner.nextLine().trim().split(" "))
                    .map(Integer::parseInt).filter(x -> x <= 0).count();
            if (k > students)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
```
> Java

In each case, iterate through the list and count all the present students in the class (if num <= 0). Then compare it with `k`. Return `YES` if it's smaller than `k`.
