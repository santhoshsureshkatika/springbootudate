package com.zensar.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

Employee employee = context.getBean("emp",Employee.class);

System.out.println(employee);
}
}

