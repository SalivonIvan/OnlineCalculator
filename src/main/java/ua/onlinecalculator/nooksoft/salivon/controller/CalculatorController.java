package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @RequestMapping(value = "exit")
    public ModelAndView toHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }
    @RequestMapping(value = "result")
    public ModelAndView toCalculate(@RequestParam("display")String expression){
        ModelAndView mv = new ModelAndView("calculator");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }
}
