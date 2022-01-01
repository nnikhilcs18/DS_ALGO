package V2.Hashing;

import java.util.HashSet;

public class subArrayWithZero {
    public static void main(String args[]) {
        int[] arr = { -3, 5, -3, -1, 8 };
        System.out.println(checkSolution(arr));
    }

    static boolean checkSolution(int[] arr) {
        int preFixSum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int element : arr) {
            preFixSum += element;
            if (preFixSum == 0)
                return true;
            if (hs.contains(preFixSum)) {
                return true;
            }
            hs.add(preFixSum);
        }
        return false;
    }
}
