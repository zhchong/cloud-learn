package com.clutch.cloud.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @description 服务提供者业务测试代码
 * @projectname cloud-learn-producer
 * @packagename com.clutch.cloud.learn.controller
 * @typename ClutchController
 * @filename ClutchController.java
 * @author Clutch
 * @date 2020年6月12日 下午3:36:54
 */
@RestController
public class ClutchController {

	@RequestMapping("/clutch")
    public String index(@RequestParam String name) {
        return "Hello "+name+"，I love you so much";
    }
	
}
