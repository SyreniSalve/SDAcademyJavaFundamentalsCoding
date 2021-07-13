package Task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        int centimeters = scanner.nextInt();

        float weightMeters = centimeters / 100f;
        float bmi = (weight / (weightMeters * weightMeters));

        if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
