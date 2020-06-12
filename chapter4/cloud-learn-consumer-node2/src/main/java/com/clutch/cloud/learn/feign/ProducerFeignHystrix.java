package com.clutch.cloud.learn.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ProducerFeignHystrix implements ProducerFeign {

	@Override
	public String hello2(@RequestParam(value = "name") String name) {
		return "hello " +name+", this messge send failed ";
	}

}
