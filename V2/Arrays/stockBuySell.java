package V2.Arrays;

public class stockBuySell {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 3, 8, 12 };
        // System.out.println(naiveApproach(arr, 0, arr.length - 1));
        System.out.println(EfficientSolution(arr, arr.length));
    }

    static int naiveApproach(int[] arr, int start, int end) {
        if (end <= start)
            return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int curr_profit = arr[j] - arr[i] + naiveApproach(arr, start, i - 1)
                            + naiveApproach(arr, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }

    static int EfficientSolution(int[] arr, int n) {
        if (n <= 1)
            return 0;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }
}
