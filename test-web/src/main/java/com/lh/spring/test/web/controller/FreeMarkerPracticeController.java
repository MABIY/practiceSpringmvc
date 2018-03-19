package com.lh.spring.test.web.controller;


import com.lh.spring.test.web.model.LatestProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FreeMarkerPracticeController {


    @RequestMapping(value = "/greenmouse", method = RequestMethod.GET)
    public String greenMouse(@ModelAttribute("model1")ModelMap modelMap) {
        modelMap.addAttribute("user", "tt1");
        modelMap.addAttribute("latestProduct", new LatestProduct("products/greenmouse.html", "green mouse"));
        return "welcome";
    }

/*
    @RequestMapping(value = "/greenmouse", method = RequestMethod.GET)
    public ModelAndView greenMouse() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("user", "tt1");
        modelAndView.addObject("latestProduct", new LatestProduct("products/greenmouse.html", "green mouse"));
        return modelAndView;
    }*/
}
