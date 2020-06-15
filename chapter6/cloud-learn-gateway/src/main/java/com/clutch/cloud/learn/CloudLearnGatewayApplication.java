package com.clutch.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @description 网关启动类
 * @projectname cloud-learn-gateway
 * @packagename com.clutch.cloud.learn
 * @typename CloudLearnGatewayApplication
 * @filename CloudLearnGatewayApplication.java
 * @author Clutch
 * @date 2020年6月15日 下午2:34:05
 */
@SpringBootApplication
public class CloudLearnGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudLearnGatewayApplication.class, args);
	}
	
	/**
	 * 
	 * @description 转发功能同样可以通过代码来实现
	 * @param builder
	 * @projectname cloud-learn-gateway
	 * @packagename com.clutch.cloud.learn
	 * @filename CloudLearnGatewayApplication.java
	 * @return RouteLocator
	 * @author Clutch
	 * @date 2020年6月15日 下午2:33:47
	 */
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("path_route", r -> r.path("/about")
						.uri("http://ityouknow.com"))
				.build();
	}
	
}
