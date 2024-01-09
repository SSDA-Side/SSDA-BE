package com.dassda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class FEController {
    @GetMapping(value = "/")
    public String fePage() {
        return "/index";
    }
}
