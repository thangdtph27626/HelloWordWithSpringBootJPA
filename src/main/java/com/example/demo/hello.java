package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author thangdt
 */
@Controller
public class hello {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "hello");
        return "hello";
    }
}
