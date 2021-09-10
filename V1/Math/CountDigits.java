package V1;

import java.util.*;

class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        CountDigits cn = new CountDigits();
        System.out.println("count=" + cn.countNumbers(inputNumber));

    }

    int countNumbers(int inputNumber) {
        int count = 0;

        if (inputNumber == 0)
            return 0;
        if (inputNumber < 0)
            inputNumber *= -1;
        while (inputNumber > 0) {
            count++;
            inputNumber = inputNumber / 10;
        }
        return count;
    }
}