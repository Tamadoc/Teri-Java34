package se.lexicon.teri.lesson1;

import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);
    String input;
    String identification;
    boolean isFirstNumber = true;

    public String getNextNumber(Calculation calc) {
        while(true) {
            if (isFirstNumber) {
                System.out.println("Enter a number (Press Q to quit)");
            } else {
                System.out.println("Enter next number");
            }
            input = scanner.next().toLowerCase();

            identification = validateNumber(input);
            if (identification.equals("invalid")) {
                System.out.println("That is not a valid number");
                continue;
            } else {
                if (identification.equals("number")) {
                    if (input.equals("0") && calc.prevOperator.equals("/")) {
                        System.out.println("You cannot divide a number by zero.");
                        continue;
                    }
                    calc.nextNumber = Double.parseDouble(input);
                }

                if (isFirstNumber) {
                    isFirstNumber = false;
                }

                return input;
            }
        }
    }

    public String getOperator(Calculation calc) {
        while(true) {
            System.out.println("Enter an operator (+, -, *, /, or =)");
            input = scanner.next().toLowerCase();

            identification = validateOperator(input);
            switch(identification) {
                case "invalid":
                    System.out.println("That is not a valid operator");
                    break;
                case "equals":
                    return "equals";
                default:
                    calc.currentOperator = input;
                    return input;
            }
        }
    }

    public String showResult(Calculation calc) {
        System.out.println("Result: " + calc.runningTotal);

        while(true) {
            System.out.println("Do you want to continue this calculation Y/N");
            input = scanner.next().toLowerCase();

            switch(input) {
                case "y":
                    getOperator(calc);
                    calc.prevOperator = calc.currentOperator;
                    break;
                case "n":
                    calc.resetCalculation();
                    isFirstNumber = true;
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
            return input;
        }
    }

    private String validateNumber(String input) {
        try {
            Double.parseDouble(input);
            return "number";
        } catch (NumberFormatException e) {
            return input.equals("q") ? "quit" : "invalid";
        }
    }

    private String validateOperator(String input) {
        String operator = input.toLowerCase();

        switch(operator) {
            case "+":
            case "-":
            case "/":
            case "*":
                return "operator";
            case "=":
                return "equals";
            case "q":
                return "quit";
            default:
                return "invalid";
        }
    }
}