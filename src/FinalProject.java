import java.util.Arrays;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
/*
    You are to a write a program which asks a user to enter 10 words.  Save these words in an array.  Using the bubble sort algorithm (see below), sort the words in an ascending order. For the output, print out the words in the original order, in the ascending order, and in the descending order. Don't forget to write a pseudocode or flowchart BEFORE writing your code.

    Your output should look something like this:

    Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

    Original Order:
    kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

    Alphabetical Order:
    apple banana cherry grapes kiwi melon orange pineapple strawberry watermelon

    Reversed Alphabetical Order:
    watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple

 */
        String[] strings = new String[10];
        String temp;
        String sorted;
        String sorted1;
        String reversedString = "";

        System.out.println("Enter 10 words");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Enter  words " + "(" + (i + 1) + "/10" + ")" + ": ");
            strings[i] = scanner.next();
        }
        System.out.print("Original Order: " + Arrays.toString(strings) + System.lineSeparator());

        for (int j = 0; j < strings.length; j++) {
            for (int i = j + 1; i < strings.length; i++) {
                // comparing adjacent strings
                if (strings[i].compareTo(strings[j]) < 0) {
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
                String word = strings[i];
                String reverseStr = "";
                for (int r = word.length() - 1; r >= 0; r--) {
                    reverseStr = reverseStr + word.charAt(r);
                    reversedString += reverseStr + " ";
                }

            }
        }


        System.out.print("Alphabetical Order: " + Arrays.toString(strings) + System.lineSeparator());
        System.out.print("Reversed Alphabetical Order" + reversedString);
    }
}