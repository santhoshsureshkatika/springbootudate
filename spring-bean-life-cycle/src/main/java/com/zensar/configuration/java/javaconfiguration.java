package com.zensar.configuration.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.beans.Student;
@Configuration
public class javaconfiguration {
	
	@Bean
    public Student student() {
    	return new Student();
    }
}
