package calculate;

/**
 * * 1. Write  a java program using the following descriptions
 * * * 1> Create one package with name calculate
 * * * 2> Create two class with name "Calculator" and "Main".
 * * * 3> Create four methods with name "addition", "subtraction", "division,
 * * * and "multiplication". All methods are instance methods and it doesn't
 * *  return anything. But it had two parameters with the names "int a" and
 * *  "int b". Also each method had System.out.println(). This prints the result.
 * *  Also create one more method with the name "calculateResult" with three parameters
 * *  with name int a, int b and char symbol. Write the logic in the calculateREsult method
 * *  that when the user enters first number and second number and symbol based on symbol it does calculate.
 * * * 4>. Write a "main" method into the main class. it had a scanner that takes user input.
 * *  Also write the logic that it ask user to "Enter first Number:", "Enter second Number:" "Please
 * *  enter one of symbol +,-,*,/:" if user enter '+' symbol result like "Addition of 5 and 10 is : 15"
 * *  and respective for other symbols.
 * * * 5>. With the result it's also print one more message "Would you like to do more calculation please
 * * enter "Y" or "N" : "
 * * Hint : Use while loop if user enter Y program asking the user to enter FirstNumber, and if user enter
 * * N programme should terminate.
 */

public class Calculator {
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " & " + b + " is " + result);
    }

    public void subtraction(int a, int b) {
        int result1 = a - b;
        System.out.println("Subtraction of " + a + " & " + b + " is " + result1);
    }

    public void multiplication(int a, int b) {
        int result2 = a * b;
        System.out.println("Multiplication of " + a + " & " + b + " is " + result2);
    }

    public void division(int a, int b) {
        int result3 = a / b;
        System.out.println("Division of " + a + " & " + b + " is " + result3);
    }

    public void calculateResult(int a, int b, char symbol) {

        if (symbol == '+') {
            int result = a + b;
            //System.out.println("Addition of " + a + " & " + b + " is " + result);
        } else if (symbol == '-') {
            int result1 = a - b;
            //System.out.println("Subtraction of " + a + " & " + b + " is " + result1);
        } else if (symbol == '*') {
            int result2 = a * b;
            //System.out.println("Multiplication of " + a + " & " + b + " is " + result2);
        } else if (symbol == '/') {
            int result3 = a / b;
            //System.out.println("Division of " + a + " & " + b + " is " + result3);
        } else {
            System.out.println("Symbol is incorrect");
        }
    }
}
