import java.io.*;
import java.util.*;

class Result {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2 && x1 != x2) return "NO";
        int steps = (x2 - x1) / (v1 - v2);
        if (steps >= 0 && x1 + (v1 * steps) == x2 + (v2 * steps))
            return "YES";
        else return "NO";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Result.kangaroo(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()));
        scanner.close();
    }
}
