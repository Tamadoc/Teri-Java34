package se.lexicon.teri.lesson1;

public class Calculator {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculation calc = new Calculation();
        System.out.println("Assignment 1: Basic calculator");
        System.out.println("==============================");

        while(true) {
            String input = userInput.getNextNumber(calc);
            if (input.equals("q")) {
                break;
            }

            input = userInput.getOperator(calc);
            if (input.equals("q")) {
                break;
            }

            calc.calculateOperation();
            if (input.equals("equals")) {
                input = userInput.showResult(calc);
                if (input.equals("q")) {
                    break;
                }
            }
        }

        System.out.println("Quitting...");
    }
}