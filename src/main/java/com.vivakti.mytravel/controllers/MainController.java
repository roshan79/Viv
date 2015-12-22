package com.vivakti.mytravel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class MainController {

  @RequestMapping("/")
  public String index(Model model) {
     System.out.println("Inside Main Controller");
     model.addAttribute("message", "HELLOOOOOOO!");
        return "index";
  }

}