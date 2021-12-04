package V2.Recursion;

public class towerOfHanoi {
    public static void main(String args[]) {
        int n = 2;
        TOH(n, 'a', 'b', 'c');
    }

    static void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move " + n + a + " -> " + c);
            return;
        }
        TOH(n - 1, a, c, b);
        System.out.println("Move " + n + a + " -> " + c);
        TOH(n - 1, b, a, c);
    }
    
}
