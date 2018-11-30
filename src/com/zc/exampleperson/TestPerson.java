package com.zc.exampleperson;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/exampleperson/contextPerson.xml");
		context.getBean("");
	}
}
