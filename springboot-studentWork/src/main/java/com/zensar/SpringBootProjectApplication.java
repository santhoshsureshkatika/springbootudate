package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"test","com.zensar"})
public class SpringBootProjectApplication {

	public static void main(String...args ) {
	System.out.println("santhosh");
		SpringApplication.run(SpringBootProjectApplication.class, args);
		System.out.println("katika");
	}
	@Bean
	public ModelMapper getmodelMapper() {
	return new ModelMapper();



	}


}
