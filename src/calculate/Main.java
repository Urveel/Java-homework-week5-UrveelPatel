package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';
        while (choice == 'Y') {

            System.out.println("Enter First Number : ");
            int num1 = scanner.nextInt();

            System.out.println("Enter Second Number : ");
            int num2 = scanner.nextInt();

            System.out.println("Enter one of Symbols :  +, -, *, / ");
            char symbol = scanner.next().charAt(0);


            Calculator obj = new Calculator();
            switch (symbol) {
                case '+':
                    obj.addition(num1, num2);
                    break;
                case '-':
                    obj.subtraction(num1, num2);
                    break;
                case '*':
                    obj.multiplication(num1, num2);
                    break;
                case '/':
                    obj.division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Symbol");
            }

            obj.calculateResult(num1, num2, symbol);
            System.out.println("Would you like to do more calculation please enter Y or N :");

            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
        scanner.close();
    }
}