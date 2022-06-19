package com.zensar.springbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.zensar.springbootdemo.dto.StudentDto;

@SpringBootApplication
@ComponentScan(basePackages={"test","com.zensar"})
public class SpringBootDemoApplication extends SpringBootServletInitializer{
	
	public static void main(String...args) {
		System.out.println("ram");
	
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("laxman");

		
	}

	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}
}
