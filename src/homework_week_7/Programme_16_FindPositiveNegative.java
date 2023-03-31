package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number id "Positive", "Negative" or "Zero"
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        findNumberIsPOsitiveOrZero(number);
        //Closing the scanner object
        scanner.close();
    }
    //finding the number is Positive neative or Zero
    public static void findNumberIsPOsitiveOrZero(int number){
        if (number > 0) {
            System.out.println(number + " is a Positive number");
        }else if (number < 0) {
            System.out.println(number + " is a Negative number");
        }else {
            System.out.println(number + " is Zero");
        }
    }
}
