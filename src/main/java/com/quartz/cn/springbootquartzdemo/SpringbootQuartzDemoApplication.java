package com.quartz.cn.springbootquartzdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*@SpringBootApplication
public class SpringbootQuartzDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootQuartzDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootQuartzDemoApplication.class);
	}
}*/

@SpringBootApplication
public class SpringbootQuartzDemoApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootQuartzDemoApplication.class, args);
	}
}

