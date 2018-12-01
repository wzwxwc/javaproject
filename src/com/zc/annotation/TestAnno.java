package com.zc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/annotation/contextAnno.xml");
		Person per=(Person) context.getBean("beanPerson_anno");
		per.show();
	}
}
