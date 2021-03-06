package ua.onlinecalculator.nooksoft.salivon.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.util.ValidatorCustomer;
import ua.onlinecalculator.nooksoft.salivon.util.VerifierCustomer;

@Controller
@RequestMapping("/")
public class AuthenticationController {

    @Autowired
    private ValidatorCustomer validator;
    @Autowired
    private VerifierCustomer verifier;
    static Logger log = LogManager.getLogger(AuthenticationController.class);

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String setupForm(Model model) {
        log.info("open page index.jsp");
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "index";
    }

    @RequestMapping(value = "error")
    public String logError() {
        log.info("open page error.jsp");
        return "error";
    }
//    @RequestMapping(value = "calculate", method = RequestMethod.POST)
//    public ModelAndView authorization(@RequestParam("inputEmail") String login, @RequestParam("inputPassword") String password) {
//        System.out.println("calculate");
//        System.out.println(login);
//        System.out.println(password);
//        Customer customer = new Customer();
//        customer.setLogin(login);
//        customer.setPassword(password);
//        ModelAndView mv = new ModelAndView("calculator");
//        validator.setCustomer(customer);
//        if (!validator.validateEmail()) {
//            mv.setViewName("error");
//            mv.addObject("message", ValidatorCustomer.ERROR_EMAIL);
//            return mv;
//        }
//        if (!validator.validatePassword()) {
//            mv.setViewName("error");
//            mv.addObject("message", ValidatorCustomer.ERROR_PASSWORD);
//            return mv;
//        }
//        verifier.setCustomer(customer);
//        verifier.verifi();
//        mv.setViewName("calculator");
//        mv.addObject("result", "0");
//        return mv;
//    }
}
