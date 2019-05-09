package com.msdi.cctvdomestic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>
 * Title: 主程序进口
 * </p>
 * <p>
 * Description:主程序进口
 * </p>
 * 
 * @author 梁泽祥
 * @date 2019年5月9日
 */
//这是一个配置Spring的配置类
@Configuration
//@SpringBootApplication：Spring Boot项目的核心注解，主要目的是开启自动配置，自动扫描该类同级包以及子包。
@SpringBootApplication
public class CctvdomesticApplication {

	public static void main(String[] args) {
		// 启动spring boot应用
		SpringApplication sa = new SpringApplication(CctvdomesticApplication.class);
		// 禁用devTools热部署
		System.setProperty("spring.devtools.restart.enabled", "true");
		// 禁用命令行更改application.properties属性
		sa.setAddCommandLineProperties(false);
		sa.run(args);
	}

}
