package com.leagueoflegends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SubmitController {

    @PostMapping("/submit")
    public String redirectionProfile(){
        return "profile";
    }
}
