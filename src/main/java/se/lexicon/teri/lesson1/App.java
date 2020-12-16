package se.lexicon.teri.lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner scanner;
    static String currentOperand;
    static String previousOperand;
    static double firstNumber;
    static double secondNumber;
    static double total;
    static boolean isStartingNumber;
    static boolean showOperandPrompt;

    public App() {
    }

    public static void main(String[] args) {
        System.out.println("Assignment 1: Basic calculator");
        System.out.println("==============================");

        while(true) {
            String option;
            while(true) {
                if (isStartingNumber) {
                    option = firstNumberOrQuit();
                    if (option.equals("quit")) {
                        System.out.println("Quitting...");
                        return;
                    }

                    if (option.equals("invalid number")) {
                        continue;
                    }

                    if (option.equals("valid number")) {
                        total = firstNumber;
                        isStartingNumber = false;
                    }
                    break;
                }

                firstNumber = total;
                break;
            }

            if (showOperandPrompt) {
                System.out.println("Input an operand (+, -, *, / or =)");
                currentOperand = scanner.next();
            }

            option = currentOperand;
            byte var2 = -1;
            switch(option.hashCode()) {
                case 42:
                    if (option.equals("*")) {
                        var2 = 3;
                    }
                    break;
                case 43:
                    if (option.equals("+")) {
                        var2 = 1;
                    }
                    break;
                case 45:
                    if (option.equals("-")) {
                        var2 = 2;
                    }
                    break;
                case 47:
                    if (option.equals("/")) {
                        var2 = 4;
                    }
                    break;
                case 61:
                    if (option.equals("=")) {
                        var2 = 0;
                    }
            }

            switch(var2) {
                case 0:
                    equals();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    displayRunningTotal();
                    boolean isValid = fetchNextNumber();
                    if (!isValid) {
                        showOperandPrompt = false;
                    } else {
                        total = calculateNext(firstNumber, secondNumber, currentOperand);
                        showOperandPrompt = true;
                        previousOperand = currentOperand;
                    }
                    break;
                default:
                    System.out.println("Please enter a valid operand");
                    isStartingNumber = false;
            }
        }
    }

    public static String firstNumberOrQuit() {
        System.out.println("Input a number (Press Q to quit)");
        String textInput = scanner.next().toLowerCase();
        if (textInput.equals("q")) {
            return "quit";
        } else {
            try {
                firstNumber = Double.parseDouble(textInput);
                return "valid number";
            } catch (NumberFormatException var2) {
                System.out.println("That is not a number");
                return "invalid number";
            }
        }
    }

    public static boolean fetchNextNumber() {
        System.out.println("Input next number");

        try {
            secondNumber = scanner.nextDouble();
            return true;
        } catch (InputMismatchException var1) {
            System.out.println("That is not a number");
            scanner.nextLine();
            return false;
        }
    }

    public static void displayRunningTotal() {
        if (!isStartingNumber) {
            total = firstNumber;
        }

        System.out.println("Running total: " + total);
    }

    public static void equals() {
        System.out.println("Result: " + total);
        continuePrompt();
    }

    public static void continuePrompt() {
        System.out.println("Do you want to continue this calculation? Y/N");

        while(true) {
            String continueCalculation = scanner.next().toLowerCase();
            byte var2 = -1;
            switch(continueCalculation.hashCode()) {
                case 110:
                    if (continueCalculation.equals("n")) {
                        var2 = 1;
                    }
                    break;
                case 121:
                    if (continueCalculation.equals("y")) {
                        var2 = 0;
                    }
            }

            switch(var2) {
                case 0:
                    currentOperand = previousOperand;
                    return;
                case 1:
                    total = 0.0D;
                    isStartingNumber = true;
                    return;
                default:
                    System.out.println("Please choose Y or N");
            }
        }
    }

    public static double calculateNext(double firstNumber, double secondNumber, String operand) {
        byte var6 = -1;
        switch(operand.hashCode()) {
            case 42:
                if (operand.equals("*")) {
                    var6 = 2;
                }
                break;
            case 43:
                if (operand.equals("+")) {
                    var6 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (operand.equals("-")) {
                    var6 = 1;
                }
                break;
            case 47:
                if (operand.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                firstNumber = add(firstNumber, secondNumber);
                break;
            case 1:
                firstNumber = subtract(firstNumber, secondNumber);
                break;
            case 2:
                firstNumber = multiply(firstNumber, secondNumber);
                break;
            case 3:
                if (secondNumber == 0.0D) {
                    System.out.println("You cannot divide by zero");
                } else {
                    firstNumber = divide(firstNumber, secondNumber);
                }
        }

        return firstNumber;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    static {
        scanner = new Scanner(System.in);
        currentOperand = "";
        previousOperand = "";
        secondNumber = 0.0D;
        total = 0.0D;
        isStartingNumber = true;
        showOperandPrompt = true;
    }
}