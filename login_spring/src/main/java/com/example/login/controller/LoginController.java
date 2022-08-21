package com.example.login.controller;

import com.example.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {

        return ("<h1>Welcome User</h1>");
//        return "userlist.jsp";
    }

//    public ModelAndView get()
//    {
//        ModelAndView mv = new ModelAndView("userlist");
//        mv.addObject("list",userRepository.findAll());
//        return mv;
//    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}

