package Task15;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
        }

        ArrayList<Integer> newList;
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (int j = 0; j < input.length; j++) {
            for (int x = 0; x < j; x++) {
                if (input[x] == input[j]) {
                    newNumbers.add(input[j]);
                }
            }
        }
        newList = removeDuplicates(newNumbers);

        Integer[] array = newList.toArray(new Integer[0]);
        for (Integer result : array){
            System.out.println(result);
        }
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer elements : list) {
            if (!newList.contains(elements)) {
                newList.add(elements);
            }
        }
        return newList;
    }
}
