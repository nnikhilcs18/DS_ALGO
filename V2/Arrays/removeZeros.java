package V2.Arrays;

public class removeZeros {
    public static void main(String args[]) {
        int[] arr = { 10, 5, 0, 8, 0, 9, 0 };
        fun(arr);
    }

    static void fun(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[res];
                arr[res] = arr[i];
                arr[i] = temp;
                res++;
            }
        }
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }
}
