package com.clutch.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @description 服务提供者启动类，需要添加@EnableDiscoveryClient注解，能够将此服务注册到注册中心
 * @projectname cloud-learn-producer
 * @packagename com.clutch.cloud.learn
 * @typename CloudLearnProducerApplication
 * @filename CloudLearnProducerApplication.java
 * @author Clutch
 * @date 2020年6月12日 下午3:31:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudLearnProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudLearnProducerApplication.class, args);
	}
	
}
