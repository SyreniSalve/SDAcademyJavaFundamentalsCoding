package Task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(newNumber(num));

    }
    static int newNumber (int n){
        int count = 0;
        int newNum = 1;
        while (n != 0) {
            count = count + (newNum * (n % 10));
            n = n / 10;
        }
        return count;
    }
}
