package com.clutch.cloud.learn.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @description 消费服务提供者接口
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致
 * name:远程服务名，即spring.application.name配置的名称
 * 添加熔断器以后需要添加fallback
 * @projectname cloud-learn-consumer
 * @packagename com.clutch.cloud.learn.feign
 * @typename ProducerFeign
 * @filename ProducerFeign.java
 * @author Clutch
 * @date 2020年6月12日 下午3:51:18
 */
@FeignClient(name = "cloud-learn-producer", fallback = ProducerFeignHystrix.class)
public interface ProducerFeign {

	@RequestMapping(value = "/clutch")
    public String hello(@RequestParam(value = "name") String name);
	
}
