package com.ecommerce.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

    private static final String ABOUT_US_VIEW = "about-us";
    private static final String ABOUT_US_PATH = "/about-us";

    @GetMapping(ABOUT_US_PATH)
    public String aboutUs() {
        return ABOUT_US_VIEW;
    }
}