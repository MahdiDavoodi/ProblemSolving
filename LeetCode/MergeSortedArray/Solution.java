import java.util.Arrays;

class Solution {
    public static void merge(int[] numbers1, int m, int[] numbers2, int n) {
        System.arraycopy(numbers2, 0, numbers1, m, n);
        Arrays.sort(numbers1);
    }
}
