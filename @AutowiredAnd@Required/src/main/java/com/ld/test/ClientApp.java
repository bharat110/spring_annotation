package com.ld.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ld.beans.Robot;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ld/config/application-context.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
