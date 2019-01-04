package com.zc.aopSalary;

import java.lang.reflect.Proxy;
import org.junit.Test;

public class TestSalary {
	@Test
	public void test() {
		Logger log = new Logger();
		Security sec = new Security();
		Privilege pri = new Privilege();
		pri.setAccess("admin11");
		Object smImpl = new SalaryManagerImpl();

		SalaryInterceptor inte = new SalaryInterceptor(log, sec, pri, smImpl);
		// 下述要创建一个代理对象
		ISalaryManager sm = (ISalaryManager) Proxy.newProxyInstance(smImpl.getClass().getClassLoader(),
				smImpl.getClass().getInterfaces(), inte);
		sm.showSalary();

	}
}
