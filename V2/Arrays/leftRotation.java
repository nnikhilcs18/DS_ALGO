package V2.Arrays;

public class leftRotation {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // rotate(arr);
        rotateN(arr, 5);
    }

    static void rotate(int[] arr) {
        int length = arr.length - 1;
        int temp = arr[0];
        for (int i = 0; i < length; i++) {
            arr[i] = arr[i + 1];
        }
        arr[length] = temp;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }

    static void rotateN(int[] arr, int n) {
        swap(0, n - 1, arr);
        swap(n, arr.length - 1, arr);
        swap(0, arr.length - 1, arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }

    static void swap(int left, int right, int[] arr) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
