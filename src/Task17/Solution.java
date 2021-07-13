package Task17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the date: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = scan.nextLine();


        LocalDate lesson = LocalDate.parse(date, formatter);
        LocalDate today = LocalDate.now();

        System.out.println(Period.between(today, lesson));
    }
}
