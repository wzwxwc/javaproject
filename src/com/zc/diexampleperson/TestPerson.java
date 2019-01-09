package com.zc.diexampleperson;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/diexampleperson/contextPerson.xml");
		IPersonAction personAct=(IPersonAction) context.getBean("beanPersonActImpl");
		personAct.savePerson();
	}
}
