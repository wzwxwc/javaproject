package com.zc.springstudytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.springstudy.Hello;

public class IocTest {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		// 启动spring容器了
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Hello hello = (Hello) context.getBean("hello11");
		hello.say();

	}
}
