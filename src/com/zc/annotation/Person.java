package com.zc.annotation;

import javax.annotation.Resource;

public class Person {
	private Long pid;
	
//	注解的形式：使用下述2个任何一个都可以
//	1、根据bean id来匹配————推荐这种方式，因为一个类型可能对应多个bean id，造成1对多
	@Resource(name = "beanStudent_anno")
//	2、自动根据类型来匹配
//	@Resource
//	下述的name值故意写错，这个是否会影响Student的bean在spring容器中的创建？
//	@Resource(name = "beanStudent")
	private Student stu;

	public void show() {
		System.out.println("执行了Person类的show方法");
		this.stu.show();
	}

}
