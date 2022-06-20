package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.zensar" })
public class SpringBootCouponApplication {
	// public class SpringBootProjectApplication extends SpringBootServletInitializer

	public static void main(String[] args) {
		System.out.println("Hii santhosh");
		SpringApplication.run(SpringBootCouponApplication.class, args);
		System.out.println("Application Started");
	}

	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// builder) {
	// TODO Auto-generated method stub
	// return super.configure(builder);
	// }
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
