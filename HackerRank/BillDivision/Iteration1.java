import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) if (i != k) sum += bill.get(i);
        int annaShare = sum / 2;
        int result = b - annaShare;
        if (result == 0) System.out.println("Bon Appetit");
        else System.out.println(result);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());
        Result.bonAppetit(bill, k, b);
        bufferedReader.close();
    }
}

/*
 * Calculate the actual share of Anna.
 * Find the difference. If there is none, print "Bone Appetit".
 * */