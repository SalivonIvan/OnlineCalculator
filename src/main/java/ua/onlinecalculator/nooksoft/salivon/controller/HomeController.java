package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView toHome() {
        System.out.println("dsjfsdkfksdfksdfsdjj");
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }

    @RequestMapping(value = "calculate", method = RequestMethod.GET)
    public ModelAndView authorization() {
        System.out.println("dsjfsdkfksdfksdfsdjj");
        ModelAndView mv = new ModelAndView("calculator");
        mv.addObject("message", "Hello Reader!");
        return mv;
    }
}