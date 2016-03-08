package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.onlinecalculator.nooksoft.salivon.util.CalculateExpression;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @Autowired
    private CalculateExpression calculate;

    @RequestMapping(value = "exit")
    public ModelAndView toHome() {
        System.out.println("exit");
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello Reader!");
        return mv;
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

}
