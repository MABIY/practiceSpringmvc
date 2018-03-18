package com.lh.spring.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class JspTestController {

    @RequestMapping("/jsp")
    public ModelAndView hadnRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("jspTest");
        modelAndView.addObject("msg", "hello world");
        return modelAndView;
    }
}
