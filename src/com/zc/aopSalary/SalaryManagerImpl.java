package com.zc.aopSalary;

public class SalaryManagerImpl implements ISalaryManager{

	@Override
	public void showSalary() {
		System.out.println("显示工资——from SalaryManagerImpl");
	}

}
