package com.clutch.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * @description 熔断监控Hystrix Dashboard和Turbine启动类
 * @projectname cloud-learn-hystrix-dashboard-turbine
 * @packagename com.clutch.cloud.learn
 * @typename CloudLearnDashboardApplication
 * @filename CloudLearnDashboardApplication.java
 * @author Clutch
 * @date 2020年6月12日 下午4:54:38
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class CloudLearnDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudLearnDashboardApplication.class, args);
	}
	
}
