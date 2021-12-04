package V2.Recursion;

public class tailRecursion {
    public static void main(String args[]) {
        // fun(5, 1);
        System.out.println(fact(5, 1));

    }

    // Tail recursive funciton to print 1 to n
    static void fun(int n, int k) {
        if (n == 0)
            return;
        System.out.println(k);
        fun(n - 1, k + 1);
    }

    // Tail recursive function to print factorial.
    static int fact(int n, int k) {
        if (n == 0 || n == 1)
            return k;
        return fact(n - 1, k * n);
    }
}
