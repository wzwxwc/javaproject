package com.zcaop.exampleSalary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 拦截器
 * 
 * @author zcAsus
 *
 */
public class SalaryInterceptor implements InvocationHandler {

	private Object target;
	private Logger logger;
	private Security security;
	private Privilege privilege;
	
	public SalaryInterceptor(Logger logger,Security security,Privilege privilege,Object target) {
		this.logger=logger;
		this.security=security;
		this.privilege=privilege;
		this.target=target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.logger.logging();	//启动日志
		this.security.security();	//启动安全性框架
		if(this.privilege.getAccess().equals("admin")) {
			System.out.println("查看工资");
//			method.invoke(this.target, args)
		}else {
			System.out.println("没有权限");
		}
		return null;
	}

}
