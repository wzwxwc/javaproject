package com.zc.scan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScan {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/scan/contextScan.xml");
		//注意下述的bean名称默认是类的小写名
		//Person per=(Person) context.getBean("Person");
		Person per=(Person) context.getBean("person");
		per.show();
	}
}
