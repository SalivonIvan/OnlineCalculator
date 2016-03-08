package ua.onlinecalculator.nooksoft.salivon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculateExpression {

    public static final String ADDITION = "+";
    public static final String SUBTRACTION = "-";
    public static final String MULTIPLICATION = "*";
    public static final String DIVISION = "/";
    private String expresion;
    @Autowired
    private ValidateExpresion validate;

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public String giveResult() {
        validate.setExpresion(expresion);
        if (!validate.validate()) {
           return "0"; 
        }
        String result = null;
        String[] arrNums = expresion.split("[-+*/]");
        String[] arrOper = expresion.split("[\\d\\.]+");
        arrOper = deleteOneElement(arrOper);
        double[] values = arrayTextToDouble(arrNums);
        try {
            result = String.valueOf(calculate(values, arrOper));

        } catch (ArithmeticException e) {
            result = "Ділення на нуль не можливе!!!";
        }
        return result;
    }

    public double calculate(double[] values, String[] operands) throws ArithmeticException {
        int y = 0;
        for (int i = 0; i < operands.length - y; i++) {
            switch (operands[i]) {
                case MULTIPLICATION:
                    values[i] = values[i] * values[i + 1];
                    for (int j = i + 1; j < values.length; j++) {
                        if (j == values.length - 1) {
                            break;
                        }
                        values[j] = values[j + 1];
                    }
                    for (int j = i; j < operands.length; j++) {
                        if (j == operands.length - 1) {
                            break;
                        }
                        operands[j] = operands[j + 1];
                    }
                    y++;
                    i--;
                    break;
                case DIVISION:
                    if (values[i + 1] == 0) {

                        throw new ArithmeticException("by zero");
                    }
                    System.out.println("val" + values[i + 1]);
                    values[i] = values[i] / values[i + 1];
                    for (int j = i + 1; j < values.length; j++) {
                        if (j == values.length - 1) {
                            break;
                        }
                        values[j] = values[j + 1];
                    }
                    for (int j = i; j < operands.length; j++) {
                        if (j == operands.length - 1) {
                            break;
                        }
                        operands[j] = operands[j + 1];
                    }
                    y++;
                    i--;
                    break;

            }
        }
        for (int i = 0; i < operands.length - y; i++) {
            switch (operands[i]) {
                case ADDITION:
                    values[i] = values[i] + values[i + 1];
                    for (int j = i + 1; j < values.length; j++) {
                        if (j == values.length - 1) {
                            break;
                        }
                        values[j] = values[j + 1];
                    }
                    for (int j = i; j < operands.length; j++) {
                        if (j == operands.length - 1) {
                            break;
                        }
                        operands[j] = operands[j + 1];
                    }
                    y++;
                    i--;
                    break;
                case SUBTRACTION:
                    values[i] = values[i] - values[i + 1];
                    for (int j = i + 1; j < values.length; j++) {
                        if (j == values.length - 1) {
                            break;
                        }
                        values[j] = values[j + 1];
                    }
                    for (int j = i; j < operands.length; j++) {
                        if (j == operands.length - 1) {
                            break;
                        }
                        operands[j] = operands[j + 1];
                    }
                    y++;
                    i--;
                    break;
            }
        }
        return values[0];
    }

    public double[] arrayTextToDouble(String[] values) {
        double[] valDouble = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            valDouble[i] = Double.valueOf(values[i]);
        }
        return valDouble;
    }

    public String[] deleteOneElement(String[] arrOper) {
        String[] arr = new String[arrOper.length - 1];
        for (int i = 0; i < arrOper.length; i++) {
            if (i == arrOper.length - 1) {
                break;
            }
            arr[i] = arrOper[i + 1];
        }
        return arr;
    }

}
