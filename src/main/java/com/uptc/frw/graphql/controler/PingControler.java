package com.uptc.frw.graphql.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PingControler {
    @GetMapping("/ping")
    public  String getPing(){
        return "Pong";
    }

}
