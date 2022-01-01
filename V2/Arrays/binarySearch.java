package V2.Arrays;

import javax.lang.model.util.ElementScanner6;

public class binarySearch {
    public static void main(String args[]) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr = { 1 };
        System.out.println(sort(arr, 1, 0, arr.length - 1));
    }

    static boolean sort(int[] arr, int num, int start, int end) {
        System.out.println(start + " " + end);
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num)
                return true;
            else if (arr[mid] > num)
                return sort(arr, num, start, mid);
            else
                return sort(arr, num, mid + 1, end);
        }
        return false;
    }
}
