package V2.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class intersectionOfTwoArrays {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 3 };
        int[] brr = { 2, 1, 1, 4 };
        cal2(arr, brr);
    }

    static void cal(int[] arr, int[] brr) {
        if (arr.length == 0 && brr.length == 0) {
            System.out.println("-1");
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int temp : arr) {
            hm.put(temp, 0);
        }
        for (int temp2 : brr) {
            if (hm.containsKey(temp2)) {
                hm.put(temp2, 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(m.getKey());
            }
        }
    }

    static void cal2(int[] arr, int[] brr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int temp : arr) {
            hs.add(temp);
        }
        for (int temp : brr) {
            if (hs.contains(temp)) {
                System.out.println(temp);
                hs.remove(temp);
            }
        }
    }
}
