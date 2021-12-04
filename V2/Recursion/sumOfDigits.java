package V2.Recursion;

public class sumOfDigits {
    public static void main(String args[]) {
        System.out.println(calculate(9987));
    }

    static int calculate(int n) {
        if (n == 0)
            return n;
        return n % 10 + calculate(n / 10);

    }

}
