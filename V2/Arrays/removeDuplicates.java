package V2.Arrays;

public class removeDuplicates {
    public static void main(String args[]) {
        int[] arr = { 0, 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8 };
        fun(arr);
    }

    static void fun(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++)
            System.out.println(arr[i]);
    }

}
