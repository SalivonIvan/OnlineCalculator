package ua.onlinecalculator.nooksoft.salivon.controller.dao;

import java.util.ArrayList;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;

public interface FileDao {

    public void saveCustomer(Customer customer);
    public ArrayList<String> getLoginCustomers();
}
