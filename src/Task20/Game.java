package Task20;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, input;
        do {
            Random random = new Random();
            num = random.nextInt(100);
            System.out.println("Please input the number between 0 - 100: ");
            input = scan.nextInt();
            if (num > input){
                System.out.println("not enough");
            } else if (num < input){
                System.out.println("to much");
            }
        } while (num != input);

        System.out.println("Congratulations!");
    }
}
