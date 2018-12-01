package com.zc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExtend {

	@Test
	public void test() {
		Student stu = new Student();
		stu.setS("123");
		System.out.println(stu.getS());
	}

	@SuppressWarnings("resource")
	@Test
	public void test2() {
		// 资源地址用斜杠分隔，类的话用点号分隔
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zc/extend/contextExtend.xml");
		Student stu=(Student) context.getBean("beanStudent");
//		stu.setS("你好");
		System.out.println(stu.getS());
		
	}
	
	
}
