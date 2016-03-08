package ua.onlinecalculator.nooksoft.salivon.util;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.FileDao;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.file.FileDaoImpl;

@Component
public class VerifierCustomer {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean verifi() {
        ArrayList<String> loginCustomers = null;
        FileDao dao = new FileDaoImpl();
        loginCustomers = dao.getLoginCustomers();
        boolean flag = true;
        for (String loginCustomer : loginCustomers) {
            if (loginCustomer.equals(customer.getLogin())) {
                flag = false;
            }
        }
        if (flag) {

            dao.saveCustomer(customer);
        }
        return true;
    }
}
