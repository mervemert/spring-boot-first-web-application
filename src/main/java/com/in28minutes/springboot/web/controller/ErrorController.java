package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("error")
public class ErrorController {

    //add handlers for spesific exceptions -> by using @ExceptionHandler
    //pass request and response parameters
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception ex){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", ex.getStackTrace());
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.setViewName("error"); //page name
        return modelAndView;
    }

}
