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

		// 下述测试是否是单例模式
		// 直接打印实例对象，实例对象会输出
		HelloAlias ha = (HelloAlias) context.getBean("hello_alias");
		ha.say();
		HelloAlias ha2 = (HelloAlias) context.getBean("hello_alias");
		System.out.println("实例ha打印结果为：" + ha);
		System.out.println("实例ha2打印结果为" + ha2);
		
		
	}

}
