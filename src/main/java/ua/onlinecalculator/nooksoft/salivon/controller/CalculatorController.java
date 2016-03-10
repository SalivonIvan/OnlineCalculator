package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.onlinecalculator.nooksoft.salivon.controller.beans.Customer;
import ua.onlinecalculator.nooksoft.salivon.util.CalculateExpression;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @Autowired
    private CalculateExpression calculate;

    @RequestMapping(value = "calculator", method = RequestMethod.GET)
    public String setupCalculator(Model model) {
        System.out.println("calculator");
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "calculator";
    }

    @RequestMapping(value = "exit")
    public String toHome() {
        System.out.println("exit");
        return "redirect:/";
    }

    @RequestMapping(value = "result")
    public ModelAndView toCalculate(@RequestParam("exp") String expression) {
        System.out.println("result");
        System.out.println(expression);
        calculate.setExpresion(expression);
        ModelAndView mv = new ModelAndView("calculator");
        mv.addObject("result", calculate.giveResult());
        return mv;
    }

    @RequestMapping(value = "resultTest", produces = "application/json")
    @ResponseBody
    public String toCalculateTest(@RequestParam("exp") String expression) {
        System.out.println("resultTest");
        System.out.println(expression);
        calculate.setExpresion(expression);

        return calculate.giveResult();
    }

}
