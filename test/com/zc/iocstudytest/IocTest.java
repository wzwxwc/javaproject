package com.zc.iocstudytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.iocstudy.Hello;
import com.zc.iocstudy.alias.HelloAlias;

public class IocTest {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		// 启动spring容器了
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Hello hello = (Hello) context.getBean("hello11");
		hello.say();
		
		HelloAlias ha=(HelloAlias)context.getBean("hello_alias");
		ha.say();
		
	}
	
	
}
