package V2.verify;

public class printNumbers {
    public static void main(String args[]) {
        towerOfHanoi(3,a,b,c)
    }

    static void subset(String str, String cur, int i) {
        if (i == str.length()) {
            System.out.println(cur);
            return;
        }
        subset(str, cur, i + 1);
        subset(str, cur + str.charAt(i), i + 1);

    }
}
