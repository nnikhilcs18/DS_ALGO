package LeetCode;

public class TwoSum {
    public static void main(String args[]) {
        int arr[] = { 17, 12, 34, 0, -18, 46, 13, 22, 6, 1, 87, -5 };
        int arr2[] = { 1, 2, 4, 4 };
        int sum = 8;
        // checkTwoSumBruteForce(arr, sum);
        checkTwoSum(arr2, sum);
    }

    static void checkTwoSumBruteForce(int[] arr, int sum) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (i == j)
                    break;
                if (arr[i] + arr[j] == sum)
                    System.out.println("first element " + arr[i] + "\nsecond element " + arr[j]);
            }
        }
    }

    static void checkTwoSum(int[] arr, int sum) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start] + arr[end];
            if (temp == sum) {
                System.out.println(arr[start] + " " + arr[end]);
                break;
            } else {
                if (temp < sum)
                    start++;
                else
                    end--;
            }
        }
    }

}
