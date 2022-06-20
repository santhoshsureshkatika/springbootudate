package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootProductApplication {
	//public class SpringBootProductApplication extends SpringBootServletInitializer{

	public static void main(String... args) {
		System.out.println("santhosh");
		SpringApplication.run(SpringBootProductApplication.class, args);
		System.out.println("katika");
	}
	//@Override
		 //protected SpringApplicationBuilder configure(SpringApplicationBuilder
		 //builder) {
		 //TODO Auto-generated method stub
		//return super.configure(builder);
		 //}
		@Bean
		public ModelMapper getmodelMapper() {
			return new ModelMapper();

		}

	}



