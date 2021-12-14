package V2.Arrays;

public class FrequencyInSortedArray {

    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 8, 8, 8, 8, 8, 8 };
        check(arr, arr.length);
    }

    static void check(int[] arr, int n) {
        if (n == 0)
            return;
        int cur = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (cur != arr[i]) {
                System.out.println(cur + " " + count);
                cur = arr[i];
                count = 1;
            } else
                count++;
        }
        System.out.println(cur + " " + count);

    }

}
