import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getPage(scanner.nextInt(), scanner.nextInt()));
    }

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
}
