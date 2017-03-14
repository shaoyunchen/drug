package com.cec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shaoyun_book on 2017/3/14.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("/")
    public @ResponseBody String index(){
        return "this is springboot test";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
