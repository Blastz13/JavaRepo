package ru.mirea.task22.task1;

import java.util.Stack;

public class Calculator {

    public static void main(String[] args) throws EmptyStackException {
        try {
            System.out.println(fromPolandToNormal("2 8 /"));
            System.out.println(fromPolandToNormal("2 10 * 2 1 / +"));
            System.out.println(fromPolandToNormal("6 1 *"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static double fromPolandToNormal(String sp_inp) throws EmptyStackException, DivisionByZeroException {
        String position = "";
        Double result = 0d;
        Stack<Double> Stack = new Stack<>();
        for (int i = 0; i < sp_inp.length(); i++) {
            if (is_oper(((Character) sp_inp.charAt(i)).toString())) {
                if (Stack.size() < 2) throw new EmptyStackException();
                result = res(Stack.pop(), Stack.pop(),
                        ((Character) sp_inp.charAt(i)).toString());
                Stack.push(result);
            } else if (sp_inp.charAt(i) == ' ' &&
                    !position.replace(" ", "").equals("")
                    && !position.replace(" ", "").equals(".")) {
                Stack.push(Double.parseDouble(position.replace(" ", "")));
                position = "";
            } else {
                position += sp_inp.charAt(i);
            }
        }

        return (Stack.empty()) ? 0 : Stack.pop();
    }

    public static boolean is_oper(String str) {
        return str.equals("+") || str.equals("-") ||
                str.equals("*") || str.equals("/");
    }

    public static Double res(Double fNumber, Double sNumbet, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && fNumber == 0) throw new DivisionByZeroException();
        switch (operand) {
            case "+":
                return fNumber + sNumbet;
            case "-":
                return sNumbet - fNumber;
            case "*":
                return fNumber * sNumbet;
            case "/":
                return sNumbet / fNumber;
        }
        return 0d;
    }
}
