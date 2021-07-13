package Task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        int[] input = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int max = 1;
        int sum = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1]) {
                sum++;
                max = Math.max(sum, max);
            } else {
                sum = 1;
            }
        }
        System.out.println("The length of the longest increasing subsequence: " + max);
    }
}
