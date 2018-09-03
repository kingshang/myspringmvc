package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "demo";
    }

    @RequestMapping("/helloworld")
    public ModelAndView helloworld(){
        ModelAndView mv=new ModelAndView("helloworld");
        return mv;
    }
}