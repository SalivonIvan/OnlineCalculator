package ua.onlinecalculator.nooksoft.salivon.util;

import org.springframework.stereotype.Component;

@Component
public class ValidateExpresion {

    private String expresion;

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public boolean validate() {
        return expresion.matches("^.+[-+*/][0-9\\.]+$");
    }

}
