package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping("/show-form")
    public String showForm(){
        return "hello-form";
    }

    @RequestMapping("/process-form")
    public String processForm(){
        return "process-form";
    }

    @RequestMapping("/process-form2")
    public String processFormWithMessage(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        if (name.isBlank() || name.isEmpty()){
            return "process-form";
        }
        name = "Hello: " + name.toUpperCase();

        model.addAttribute("message", name);

        return "process-form2";
    }

    @RequestMapping("/process-form3")
    public String processFormWithMessage3(@RequestParam("name") String name, Model model){
        if (name.isBlank() || name.isEmpty()){
            return "process-form";
        }
        name = "Hello: " + name.toUpperCase() + " using request param";

        model.addAttribute("message", name);

        return "process-form2";
    }
}
