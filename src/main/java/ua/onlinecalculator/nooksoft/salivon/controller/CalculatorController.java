package ua.onlinecalculator.nooksoft.salivon.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.onlinecalculator.nooksoft.salivon.util.CalculateExpression;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @Autowired
    private CalculateExpression calculate;
    static Logger log = LogManager.getLogger(CalculatorController.class);

    @RequestMapping(value = "calculator", method = RequestMethod.GET)
    public String setupCalculator(Model model) {
        log.info("open page calculator.jsp");
        return "calculator";
    }
 
    @RequestMapping(value = "result", produces = "application/json")
    @ResponseBody
    public String toCalculateTest(@RequestParam("exp") String expression) {
        log.info("start calculate");
        log.info(expression);
        calculate.setExpresion(expression);
        return calculate.giveResult();
    }

}
