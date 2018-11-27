package com.zc.distudytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.distudy.Person;

public class DiTest {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextDI.xml");
		Person per = (Person) context.getBean("person");
		System.out.println(per);
		System.out.println(per.getPname());
		per.getStudent().show();
		
		
	}
}


