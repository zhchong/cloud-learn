package com.clutch.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * @description 服务消费者启动类
 * 注解@EnableDiscoveryClient 启用服务注册与发现
 * 注解@EnableFeignClients 启用feign进行远程调用
 * 注解@EnableHystrixDashboard 熔断器监控
 * @projectname cloud-learn-consumer
 * @packagename com.clutch.cloud.learn
 * @typename CloudLearnConsumerApplication
 * @filename CloudLearnConsumerApplication.java
 * @author Clutch
 * @date 2020年6月12日 下午3:43:25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class CloudLearnConsumerNode1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudLearnConsumerNode1Application.class, args);
	}
	
}
