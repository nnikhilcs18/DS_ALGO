package V2.Arrays;

public class HighestConcequitiveOnes {
    public static void main(String args[]) {
        int[] arr = { 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0 };
        System.out.println(check(arr, arr.length));
    }

    static int check(int[] arr, int n) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
}
