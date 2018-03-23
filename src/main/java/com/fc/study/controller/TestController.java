package com.fc.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String testPage(Model model){
        model.addAttribute("name","test");
        return "/web/test";
    }
}
