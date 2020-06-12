package com.clutch.cloud.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clutch.cloud.learn.feign.ProducerFeign;

@RestController
public class CloudLearnConsumerController {

    @Autowired
    ProducerFeign producerFeign;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return producerFeign.hello(name);
    }
	
}
