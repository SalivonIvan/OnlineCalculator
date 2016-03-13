package ua.onlinecalculator.nooksoft.salivon.controller.dao.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.FileDao;

public class FileDaoImpl implements FileDao {

    @Override
    public void saveCustomer(Customer customer) {
        File file = new File("customer.csv");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write(customer.getLogin() + "|" + customer.getPassword() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(FileDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<String> getLoginCustomers() {
        ArrayList<String> loginCustomers = new ArrayList<>();
        File file = new File("customer.csv");
        String strCustomer = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((strCustomer = br.readLine()) != null) {
                String[] arr = strCustomer.split("[|]");
                String login = arr[0].trim();
                loginCustomers.add(login);
            }

        } catch (IOException ex) {
            Logger.getLogger(FileDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loginCustomers;
    }

}
