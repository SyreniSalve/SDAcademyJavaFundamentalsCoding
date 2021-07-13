package Task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if(x < 0){
            System.out.println("Please take the positive number");
            scan.nextInt();
        }
        for (int i = 1; i < x; i++){
            if (i % 3 == 0 && i % 7 == 0){
                System.out.println("Fizz buzz");
            } else if (i % 7 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
