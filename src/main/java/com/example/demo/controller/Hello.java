package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author thangdt
 */
@Controller
public class Hello {

    @RequestMapping(value = "/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "hello");
        return "hello";
    }
}
