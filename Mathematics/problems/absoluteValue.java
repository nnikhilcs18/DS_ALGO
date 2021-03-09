package problems;

import java.io.*;
import java.util.*;

class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends



class Solution {
    public int absolute(int I) {
        // code here
        if(I<0)
        return I*(-1);
        else
        return I;

    }
}
