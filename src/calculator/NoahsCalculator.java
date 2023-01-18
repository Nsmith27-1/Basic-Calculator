package calculator;

import java.util.Scanner;
import java.lang.Math;


    public class NoahsCalculator {
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Welcome to the calculator! ");
            System.out.println("First, set the mode that you wish to use ");
            System.out.println("To use addition type Add, to use subtraction type Subtract ");
            System.out.println("To use multiplication, type Multiply, to use division type Divide ");
            System.out.println("To find the square root of something, type Square Root, and to use exponents, type Power ");
            System.out.println("If you wish to exit the program, type quit");

            while (true) {
                System.out.print("Enter your desired mode: ");
                String command = scanner.nextLine();

                if (command.equals("quit")) {
                    break;
                } else if (command.equals("Add")) {
                    System.out.println("Enter the number you want to add: ");
                    double augend = scanner.nextDouble();
                    System.out.println("Enter the number you want to add it too: ");
                    double addend = scanner.nextDouble();
                    double sum = augend + addend;
                    System.out.print("The sum is " + sum);
                    break;
                } else if (command.equals("Subtract")) {
                    System.out.println("Enter the number you wish to subtract from: ");
                    double minuend = scanner.nextDouble();
                    System.out.println("Enter the number you want to subtract from it: ");
                    double subtrahend = scanner.nextDouble();
                    double difference = minuend - subtrahend;
                    System.out.println("The difference is: " + difference);
                    break;
                } else if (command.equals("Multiply")) {
                    System.out.println("Enter the number you wish to multiply: ");
                    double factor1 = scanner.nextDouble();
                    System.out.println("Enter the number you wish to multiply it by: ");
                    double factor2 = scanner.nextDouble();
                    double product = factor1 * factor2;
                    System.out.println("The product is " + product);
                    break;
                } else if (command.equals("Divide")) {
                    System.out.println("Enter the number you want to divide: ");
                    double dividend = scanner.nextDouble();
                    System.out.println("Enter the number you want to divide it by ");
                    double divisor = scanner.nextDouble();
                    double quotient = dividend / divisor;
                    System.out.println("The quotient is: " + quotient);
                    break;
                } else if (command.equals("Square Root")) {
                    System.out.println("Enter the number you would like to find the square root of: ");
                    double sqNum = scanner.nextDouble();
                    double sqaureRootVal = Math.pow(sqNum, 0.5);
                    System.out.println("The square root of " + sqNum + " is: " + sqaureRootVal);
                    break;
                } else if (command.equals("Power")) {
                    System.out.println("Please enter the first number: ");
                    double baseNum = scanner.nextDouble();
                    System.out.println("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    double result = (Math.pow(baseNum, exponent));
                    System.out.println("The result is: " + result);
                    break;
                }
        }
    }
}