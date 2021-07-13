package Task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        float num1;
        float num2;
        char operator;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        num1 = scan.nextFloat();
        System.out.println("Please enter one of the following symbols: +, -, / or *");
        operator = scan.next().charAt(0);
        System.out.println("Please enter the second number: ");
        num2 = scan.nextFloat();

        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Cannot calculate");
                }
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}
