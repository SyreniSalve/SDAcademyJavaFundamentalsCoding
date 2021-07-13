package Task14;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input two lowercase letters of the Latin alphabet: ");
        char charOne = scan.next().charAt(0);
        char charTwo = scan.next().charAt(0);

        int count = 0;
        if (charOne < charTwo) {
            for (int i = 0; charOne < charTwo; i++, charOne++) {
                count = i;
            }
        } else {
            for (int i = 0; charTwo < charOne; i++, charTwo++) {
                count = i;
            }
        }
        if (count == 1){
            System.out.println("Between given letters is " + count + " character.");
        } else if(count == 0){
            System.out.println("Invalid input or letters match");
        }  else {
            System.out.println("Between given letters is " + count + " characters.");
        }
    }
}
