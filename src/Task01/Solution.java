package Task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();

        double perimeter = Math.PI * diameter;

        System.out.println("Circle perimeter: "+ perimeter);
    }
}
