package V2.Arrays;

public class prefixSum {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 8, 3, 9, 6, 5, 4 };
        int[] preFixSum = genreateprefixSumArray(arr);
        System.out.println(checkValue(preFixSum, 0, 3));
    }

    static int[] genreateprefixSumArray(int[] arr) {
        int sum = 0;
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            brr[i] = sum;

        }
        return brr;
    }

    static int checkValue(int[] arr, int left, int right) {
        return left == 0 ? (arr[right]) : (arr[right] - arr[left - 1]);
    }
}
