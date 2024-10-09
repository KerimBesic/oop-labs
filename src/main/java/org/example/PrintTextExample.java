package org.example;

/* 2.
import java.util.Scanner;

class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the three numbers is: " + sum);
        scanner.close();
    }
} */

/* 3
import java.util.Scanner;

public class PrintTextExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter numbers to sum them up. Enter 0 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The total sum is: " + sum);
        scanner.close();
    }
}
 */


/* 6.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times do you want to print the text? ");
        int times = scanner.nextInt();

        printText(times);
        scanner.close();
    }
    public static void printText(int times) {
        String text = "In the beginning there were the swamp, the hoe and Java.";

        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
} */