package ua.onlinecalculator.nooksoft.salivon.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.FileDao;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.file.FileDaoImpl;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView toHome() {
        System.out.println("index");
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }

    @RequestMapping(value = "calculate")
    public ModelAndView authorization(@RequestParam("inputEmail") String login, @RequestParam("inputPassword") String password) {
        System.out.println("calculate");
        System.out.println(login);
        System.out.println(password);
        validate(login, password);
        ModelAndView mv = new ModelAndView("calculator");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }

    public void validate(String login, String password) {
        Customer customer = new Customer();
        customer.setLogin(login);
        customer.setPassword(password);
        ArrayList<String> loginCustomers = null;
        FileDao dao = new FileDaoImpl();
        loginCustomers = dao.getLoginCustomers();
        boolean flag = true;
        for (String loginCustomer : loginCustomers) {
            if (loginCustomer.equals(login)) {
                flag=false;
            }
        }
        if (flag) {
            
                dao.saveCustomer(customer);
        }
    }
}
