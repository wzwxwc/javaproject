package com.zc.distudy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zc/distudy/contextDI.xml");
		Person per = (Person) context.getBean("person");
		System.out.println(per);
		System.out.println(per.getPname());
		
		Student st=(Student)context.getBean("studentBean");
//		System.out.println("grade is " + st.getGrade());
//		System.out.println("rank is " + st.getRank());
		System.out.println(st.toString());
		st.show();
		
		//奇怪，下述为什么不能进行智能提示呢？
		Student st2=new Student(1,"aa");
		st2.show();
	}
}
