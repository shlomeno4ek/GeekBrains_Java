package view;

import model.Complex;
import util.Calculable;
import util.Operators;
import util.impl.Calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserView {
    private final List<String> validOperators;
    private Calculable calculator;

    public UserView(Calculable calculator) {
        this.calculator = calculator;
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    public void run() {
        while (true) {
            prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }

    private void prepare() {
        Complex a = promtComplex();
        String operator = promtOperation();
        Complex b = promtComplex();

        if (operator.equals("*")) {
            calculator.multiply(a, b);
        }

        if (operator.equals("+")) {
            calculator.sum(a, b);
        }

        if (operator.equals("/")) {
            calculator.divide(a, b);
        }

        calculator.result();
        calculator.clear();
    }

    private Complex promtComplex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите действительную часть: ");
        int a = sc.nextInt();
        System.out.print("Введите мнимую часть: ");
        int b = sc.nextInt();
        return new Complex(a, b);
    }

    private String promtOperation() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Entered invalid math operator. " + "Enter the math operation (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }

    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Continue?... (y/n)");
        return in.nextLine();
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }
}
