package com.neeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
       System.out.println("ApplicationContext Container is now ready");
       System.out.println("*********");
       Hello h1=(Hello)ctx.getBean("hello");
       Hello h2=(Hello)ctx.getBean("hello");
       System.out.println(h1==h2);
	}

}
