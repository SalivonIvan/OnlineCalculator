package ua.onlinecalculator.nooksoft.salivon.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;

@Component
public class ValidatorCustomer {

    public static final String ERROR_EMAIL = "Не правильно введений логін!";
    public static final String ERROR_PASSWORD = "Не правильно введений пароль!";
    private final Pattern patternEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private final Pattern patternPasword =Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean validatePassword() {
        Matcher matcher = patternPasword.matcher(customer.getPassword());
        return matcher.find();
    }

    public boolean validateEmail() {
        Matcher matcher = patternEmail.matcher(customer.getLogin());
        return matcher.find();
    }

}
