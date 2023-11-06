package homeworkweek5;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll no, and three subjects
 * Math, Science and English marks
 * (marks is between '0' to '100' and it is out of range print error message
 * " Invalid Input - Marks Should be Between '0' to '100' ")
 * and find out total, percentage and result.
 * if he is pass or fail on basis of percentage (pass >= 35)
 * and also give them grade.
 * if % >=80 "A+".
 * % >=60 "A",
 * % >= 50 "B",
 * % >= 35 "C".
 * And print MarkSheet in the following Format;
 * *_______________________________
 * |
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
 * <p>
 * write this program using if else and while loop.
 */

public class Programme_2 {

    //calculate sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculate result for pass or fail
    public static String calcResult(int mathsMarks, int scienceMarks, int englishMarks) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        }
        return "Pass";
    }

    //calculate percentage and grade
    public static String gradeCheck(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return grade;
    }

    // Print mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|           Mark Sheet            |");
        System.out.println("|_________________________________|");
        System.out.println("| Name       : " + name + "                |");
        System.out.println("| Roll No    : " + rollNum + "                |");
        System.out.println("|_________________________________|");
        System.out.println("| Subjects   : Marks              |");
        System.out.println("|_________________________________|");
        System.out.println("| Math       : " + mathsMarks + "                   |");
        System.out.println("| Science    : " + scienceMarks + "                |");
        System.out.println("| English    : " + englishMarks + "                |");
        System.out.println("|_________________________________|");
        System.out.println("| Total      : " + total + "             |");
        System.out.println("|_________________________________|");
        System.out.println("| Percentage : " + percentage + "           |");
        System.out.println("| Result     : " + result + "               |");
        System.out.println("| Grade      : " + grade + "                  |");
        System.out.println("|---------------------------------+");
    }

    public static void main(String[] args) {

        // Scanner declaration for reading input formm console
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name        \t\t:\t");
        String name = scanner.next();
        System.out.print("\nEnter student Roll Number  \t:\t");
        int rollNum = scanner.nextInt();

        System.out.print("\nEnter Marks of subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathsMarks = scanner.nextInt();
        }

        System.out.print("\nEnter Marks of subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            scienceMarks = scanner.nextInt();
        }

        System.out.print("\nEnter Marks of subject English \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input. Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calcResult(mathsMarks, scienceMarks, englishMarks);
        String grade = gradeCheck(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //Closing the scanner object
        scanner.close();
    }
}