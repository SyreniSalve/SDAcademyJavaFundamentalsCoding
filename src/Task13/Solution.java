package Task13;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i ++){
            System.out.print(words[i] + " " + words[i] + " ");
        }
    }
}
