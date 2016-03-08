package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.util.ValidatorCustomer;
import ua.onlinecalculator.nooksoft.salivon.util.VerifierCustomer;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ValidatorCustomer validator;
    @Autowired
    private VerifierCustomer verifier;

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
        Customer customer = new Customer();
        customer.setLogin(login);
        customer.setPassword(password);
        ModelAndView mv = new ModelAndView("calculator");
        validator.setCustomer(customer);
        if (!validator.validateEmail()) {
            mv.setViewName("error");
            mv.addObject("message", ValidatorCustomer.ERROR_EMAIL);
            return mv;
        }
        if (!validator.validatePassword()) {
            mv.setViewName("error");
            mv.addObject("message", ValidatorCustomer.ERROR_PASSWORD);
            return mv;
        }
        verifier.setCustomer(customer);
        verifier.verifi();
        mv.setViewName("calculator");
        mv.addObject("result", "0");
        return mv;
    }

}
