package Task18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("acho+!\\B");
        Matcher matcher = pattern.matcher(scan.nextLine());
        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("User sneezed");
        } else {
            System.out.println("User not sneezed");
        }
    }
}
