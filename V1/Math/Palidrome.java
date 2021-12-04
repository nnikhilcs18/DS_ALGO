package V1.Math;

import java.util.*;

public class Palidrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(checkPalidrome(input));
    }

    // space & time complexity is O(n)
    static boolean checkPalidrome(int input) {
        int rev = 0;
        int temp = input;
        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return input == rev;
    }
    static boolean checkPalidromeLeet(int input){
        if((input<0)||(input %10==0 && input!=0))
            return false;
        int rev=0;
        while(input >rev){
            int ld=input%10;
            rev=rev*10+ld;
            input=input/10;
        }
        return input==rev || input/10==rev;

    }
}
