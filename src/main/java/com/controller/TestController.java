package com.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/one")
    public String show(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        org.springframework.security.core.userdetails.User user = (org.springframework.security.core.userdetails.User) principal;
        model.addAttribute("loggedInUser", ((User) principal).getUsername());
        return "show";
    }

    @RequestMapping("/two")
    public String clienthome(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        org.springframework.security.core.userdetails.User user = (org.springframework.security.core.userdetails.User) principal;
        model.addAttribute("loggedInUser", ((User) principal).getUsername());
        return "clienthome";
    }
}
