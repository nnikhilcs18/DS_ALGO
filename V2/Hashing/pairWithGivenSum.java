package V2.Hashing;

import java.util.HashSet;

public class pairWithGivenSum {
    public static void main(String args[]) {
        int[] sorted = { 1, 1, 2, 4, 4 };
        // System.out.println(checkSorted(sorted, 8));
        System.out.println(checkUnSorted(sorted, 8));
    }

    static boolean checkSorted(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left] + arr[right];
            if (temp == sum)
                return true;
            if (temp < sum)
                left++;
            else
                right--;

        }
        return false;
    }

    static boolean checkUnSorted(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int element : arr) {
            int complement = sum - element;
            if (hs.contains(complement))
                return true;
            else
                hs.add(element);
        }
        return false;
    }
}
