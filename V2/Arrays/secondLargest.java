package V2.Arrays;

public class secondLargest {
    public static void main(String args[]) {
        int[] arr = { 8, 21, 3, 4, 55, 6, 77, 8, 9 };
        System.out.println(findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr) {
        int lar = 0, res = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[lar]) {
                res = lar;
                lar = i;
            } else if (arr[i] != arr[lar]) {
                if (res == -1 || arr[res] < arr[i])
                    res = i;
            }
        }
        return arr[res];
    }

}
