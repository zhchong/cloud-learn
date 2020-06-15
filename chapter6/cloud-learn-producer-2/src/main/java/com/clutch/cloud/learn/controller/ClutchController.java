package com.clutch.cloud.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClutchController {

	@RequestMapping("/clutch")
    public String index(@RequestParam String name) {
        return "Hello 22222222222 "+name+"，I love you so much";
    }
	
}
