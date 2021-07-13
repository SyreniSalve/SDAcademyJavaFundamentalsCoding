package Task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = (b * b) - 4 * a * c;
        double delta2 = Math.sqrt(delta);

        if (delta < 0){
            System.out.println("Delta negative");
        } else if (delta == 0){
            double x = + (- b + delta2) / (2 * a);
            System.out.println(x);
        } else {
            double x1 = (- b - delta2) / (2 * a);
            double x2 = (- b + delta2) / (2 * a);

            System.out.println(x1 + "\n" + x2);
        }
    }
}
