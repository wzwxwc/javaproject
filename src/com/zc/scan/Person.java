package com.zc.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Person {
//	private Long pid;
	
	@Resource
	private Student stu;

	public void show() {
		System.out.println("执行了Person类的show方法");
		this.stu.show();
	}

}
