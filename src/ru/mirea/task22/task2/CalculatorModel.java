package ru.mirea.task22.task2;

import ru.mirea.task22.task1.DivisionByZeroException;
import ru.mirea.task22.task1.EmptyStackException;

import java.util.Stack;

public class CalculatorModel {

    private String stUserInput;
    private String stResult;

    public CalculatorModel() {
        stUserInput = "";
        stResult = "";
    }

    public String getUserInput() {
        return stUserInput;
    }

    public void setUserInput(String stUserInput) {
        this.stUserInput = stUserInput;
    }

    public String getResult() {
        return stResult;
    }

    public void setResult(String stResult) {
        this.stResult = stResult;
    }

    public void fromPoland() throws EmptyStackException, DivisionByZeroException, EmptyStringException, DoubleParseException {
        Double result = 0d;
        if (stUserInput.equals("")) throw new EmptyStringException();
        String position = "";
        Stack<Double> Stack = new Stack<>();
        for (int i = 0; i < stUserInput.length(); i++) {
            if (isop(((Character) stUserInput.charAt(i)).toString())) {
                if (Stack.size() < 2) throw new EmptyStackException();
                result = operationResult(Stack.pop(), Stack.pop(), ((Character) stUserInput.charAt(i)).toString());
                Stack.push(result);
            } else if (stUserInput.charAt(i) == ' ' && !position.replace(" ", "").equals("") && !position.replace(" ", "").equals(".")) {
                try {
                    Stack.push(Double.parseDouble(position.replace(" ", "")));
                } catch (Exception ex) {
                    throw new DoubleParseException();
                }
                position = "";
            } else {
                position += stUserInput.charAt(i);
            }
        }

        stResult = String.valueOf(((Stack.empty()) ? 0 : Stack.pop()));
    }

    public boolean isop(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0) throw new DivisionByZeroException();
        switch (operand) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return secondNum - firstNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return secondNum / firstNum;
        }
        return 0d;
    }

}
