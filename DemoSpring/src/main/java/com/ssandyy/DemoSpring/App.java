package com.ssandyy.DemoSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!, This is main of App class..!");

		App.springWithXmlBeanFactory();
		App.springUsingApplicationContext();
		App.springApplicationContextCallThroughConstructor();

		App.springApplicationContextLetsPlay1();
		App.springGetSet();

	}

	public static void springGetSet() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj = (Alien) context.getBean("alien");
		System.out.println(obj.getName()); // get by property tag in spring.xml file under bean
	}

	public static void springApplicationContextLetsPlay1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj1 = (Alien) context.getBean("alien");
		obj1.show();
		System.out.println("age: " + obj1.age);

		Alien obj2 = (Alien) context.getBean("alien");
		obj2.show();
		obj2.age = 15;
		System.out.println("age: " + obj2.age);

		Alien obj3 = (Alien) context.getBean("alien");
		obj3.show();
		System.out.println("age: " + obj3.age);

	}

	public static void springWithXmlBeanFactory() {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // XmlBeanFactory() is
																						// depricated, work on till
																						// spring-context 5.x versions
		Alien obj = (Alien) factory.getBean("alien");
		obj.show();
	}

	public static void springUsingApplicationContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj = (Alien) context.getBean("alien");
		obj.show();
	}

	public static void springApplicationContextCallThroughConstructor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	}

}
