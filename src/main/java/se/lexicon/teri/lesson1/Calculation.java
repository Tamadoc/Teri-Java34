package se.lexicon.teri.lesson1;

class Calculation {
    double nextNumber = 0.0D;
    double runningTotal = 0.0D;
    String prevOperator = "+";
    String currentOperator = "";

    Calculation() {
    }

    public void calculateOperation() {
        String operator = prevOperator;

        switch(operator) {
            case "+":
                runningTotal += nextNumber;
                break;
            case "-":
                runningTotal -= nextNumber;
                break;
            case "*":
                runningTotal *= nextNumber;
                break;
            case "/":
                runningTotal /= nextNumber;
        }

        prevOperator = currentOperator;
    }

    public void resetCalculation() {
        nextNumber = 0.0D;
        runningTotal = 0.0D;
        prevOperator = "+";
        currentOperator = "";
    }
}