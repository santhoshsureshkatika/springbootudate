package com.zensar.spring_with_maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Address;
import com.zensar.beans.Product;
import com.zensar.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
      // Product p2=(Product)context.(p2);
       //Product p1=(Product)context.(p1);
    	Student student = context.getBean("s1",Student.class);
    	//Address address =context.getBean("student",Address.class);
       System.out.println(student);
      // System.out.println(p2);
    }
}
