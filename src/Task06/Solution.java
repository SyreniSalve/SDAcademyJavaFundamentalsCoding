package Task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
    }
    static double sum (int n){
        double i,s = 0.0;
        for (i = 1; i < n; ++i) {
            s = s + 1 / i;
        }
        return s;
    }
}
