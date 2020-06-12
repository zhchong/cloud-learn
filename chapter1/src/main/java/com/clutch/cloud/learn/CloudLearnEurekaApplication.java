package com.clutch.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @description 注册中心启动类
 * @projectname cloud-learn-eureka
 * @packagename com.clutch.cloud.learn
 * @typename CloudLearnEurekaApplication
 * @filename CloudLearnEurekaApplication.java
 * @author Clutch
 * @date 2020年6月12日 下午2:33:53
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudLearnEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudLearnEurekaApplication.class, args);
	}
	
}
