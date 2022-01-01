package V2.Hashing;

import java.util.HashMap;
import java.util.Map;

public class countDistinctElements {
    public static void main(String args[]) {
        int[] arr = { 10, 10, 10, 10 };
        check(arr, arr.length);
    }

    static void check(int[] arr, int size) {
        if (size == 0)
            return;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : arr) {
            if (hm.containsKey(n)) {
                hm.put(n, hm.get(n) + 1);
            } else {
                hm.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
