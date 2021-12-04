package V2.Recursion;

public class ropeCuttingProblem {
    public static void main(String args[]) {
        System.out.println(cut(12, 1, 3, 2));
    }

    static int cut(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = Math.max(cut(n - a, a, b, c), Math.max(cut(n - b, a, b, c), cut(n - c, a, b, c)));
        if (res < 0)
            return -1;
        return res + 1;
    }
}
