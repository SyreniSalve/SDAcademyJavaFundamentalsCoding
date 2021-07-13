package Task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int result = findIndex(num);
        System.out.println(result);

    }
    static int findIndex(int n){
        if (n <= 1){
            return n;
        }
        int n1 = 0, n2 = 1, n3;

        for (int i = 0; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }
}
