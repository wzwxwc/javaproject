package zcjava.reflectstudy;

import org.junit.Test;

public class TestReflect {
	@Test
	public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Student stu=new Student();
		Class c1=Student.class;
		Class c2=stu.getClass();
		Class c3=Class.forName("zcjava.reflectstudy.Student");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		Student stu2=(Student) c1.newInstance();
		
		
		
	}
}
