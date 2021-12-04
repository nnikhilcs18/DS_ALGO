package V2.Recursion;

public class decimalToBinary {
    public static void main(String args[]) {
        fun(13);
    }

    static void fun(int n) {
        if (n == 0)
            return;
        fun(n / 2);
        System.out.print(n % 2);
    }
}
