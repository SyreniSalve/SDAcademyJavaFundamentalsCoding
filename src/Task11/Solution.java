package Task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value;
        String longestText = "";

        while (true) {
            System.out.println("Enter text:");
            value = sc.nextLine();
            if ("Enough!".equalsIgnoreCase(value)) break;

            if (value.length() == 0) {
                System.out.println("No text provided");
            }

            if (longestText.length() < value.length()) {
                longestText = value;
            }
        }

        if (!longestText.equals("")) {
            System.out.println(longestText);
        } else {
            System.out.println("No text provided");
        }
    }
}
