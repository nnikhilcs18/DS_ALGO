package V2.Arrays;

public class leaders {
    public static void main(String args[]) {
        int[] arr = { 67, 1, 7, 10, 4, 6, 5, 2 };
        int right = arr.length - 1;
        checkLeaders(arr, right);
    }

    static void checkLeaders(int[] arr, int right) {
        int cur_leader = arr[right];
        System.out.println(cur_leader);
        for (int i = right - 1; i >= 0; i--) {
            if (arr[i] > cur_leader) {
                cur_leader = arr[i];
                System.out.println(cur_leader);
            }
        }
    }
}
