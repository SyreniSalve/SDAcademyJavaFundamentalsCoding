package Task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double counter = 0;
        double counter2 = 0;
        int i = 0;

        String text = scan.nextLine();
        String[] allSymbols = text.split("");

        while ( i < allSymbols.length){
            if (allSymbols[i].equals(" ")){
                counter += 1;
            } else {
                counter2 += 1;
            }
            i++;
        }
        double result = percentages(counter, i);
        System.out.printf("Empty spaces are %.1f percent: ", result);

    }
    static double percentages (double a, double b){
        return (a / b) * 100;

    }

}
