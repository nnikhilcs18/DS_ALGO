package V2.Arrays;

public class sortedCheck {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println(reverse(arr));
        reverse(arr);
    }

    static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
