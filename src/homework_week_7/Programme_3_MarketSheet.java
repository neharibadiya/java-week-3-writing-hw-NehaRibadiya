package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_3_MarketSheet {
    public static void main(String[] args) {
        //scamner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter student Name      \t \t:\t");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks Of Subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject science\t:\t");
        int scinceMarks = scanner.nextInt();
        if (scinceMarks < 0 || scinceMarks > 100) {
            System.out.println("\nInvalid input, marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scinceMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scinceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scinceMarks, englishMarks);
        String grade = calcilateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scinceMarks, englishMarks, total, percentage, result, grade);
        //closing the scanner object
        scanner.close();
    }
    //calculating the sum
    public static int sum(int a, int b, int c){
        return a+b+b;
    }
    //calculating the result on subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks){
        if (mathsMarks <35 || scienceMarks <35 || englishMarks <35){
            return "Fail";
        }
        else {
            return "Pass";
        }
    }
    //calculating the grade on percentages and result
    public static String calcilateGrade(int percentage, String result){
        String grade = null;
        if(result.equalsIgnoreCase("Pass")){
            if (percentage >= 80){
                grade = "A+";
;            }else if (percentage >= 60){
                grade = "A";
            }else if (percentage >= 50){
                grade = "B";
            }
            else if (percentage >= 35){
                grade = "C";
            }
        }else {
            grade = "_";
        }
        return grade;
    }
    //Printing the marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}