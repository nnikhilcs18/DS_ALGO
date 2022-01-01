package V2.Arrays;

public class Equilibrium {
    public static void main(String args[]) {
        int[] arr = { 3, 4, 8, -9, 20, 6 };
        int n = arr.length;
        System.out.println(isEqPoint(arr, n));
    }

    static boolean isEqPoint(int[] arr, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int l_sum = 0;
        for (int i = 0; i < n; i++) {
            if (l_sum == sum - arr[i]) {
                return true;
            }
            l_sum += arr[i];
            sum -= arr[i];
        }
        return false;
    }
}
