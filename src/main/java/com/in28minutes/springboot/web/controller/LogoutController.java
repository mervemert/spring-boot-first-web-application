package com.in28minutes.springboot.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("name")
public class LogoutController {

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showWelcomePage(HttpServletRequest request, HttpServletResponse response) {
        //get authentication
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null)
            //logout yapabilmek için request, response vs metoda geçirmemiz gerek.
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        return "redirect:/";
    }

}
