package V2.Recursion;

public class nthFibonacci {
    public static void main(String args[]) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

}
