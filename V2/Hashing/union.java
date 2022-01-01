package V2.Hashing;

import java.util.HashSet;

public class union {
    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 3 };
        int[] brr = { 12, 18 };
        System.out.println(check(arr, brr));
    }

    static int check(int[] arr, int[] brr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int element : arr) {
            hs.add(element);
        }
        for (int element : brr) {
            hs.add(element);
        }
        return hs.size();
    }
}
