package io.tanukisoftware.SpringBootIntegrationWithTanukiSoftware.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/landing")
public class LandingController {


    @Value("${welcome}")
    private String welcomeMessage;

    @GetMapping("/welcome")
    public String landing() {

        return welcomeMessage;
    }
}
