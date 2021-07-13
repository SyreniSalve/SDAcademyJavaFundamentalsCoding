package Task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        if (x < 0){
            System.out.println("Please take the positive number: ");
            scan.nextInt();
        }
        for (int i = 0; i < x; i++){
            int counter = 0;
            for (int num = i; num >= 1; num--){
                if (i % num == 0){
                    counter = counter + 1;
                }
            }
            if (counter == 2){
                System.out.println(i);
            }
        }
    }
}
