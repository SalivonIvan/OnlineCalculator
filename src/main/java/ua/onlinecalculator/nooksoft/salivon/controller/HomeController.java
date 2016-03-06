package ua.onlinecalculator.nooksoft.salivon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

   @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        System.out.println("dsjfsdkfksdfksdfsdjj");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Reader!");
        mv.setViewName("index");
        return mv;
    }
}
