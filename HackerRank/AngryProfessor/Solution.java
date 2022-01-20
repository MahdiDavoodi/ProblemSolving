import java.util.Arrays;
import java.util.Scanner;

public class Solution {
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
        scanner.close();
    }
}
