package com.zc.exampleperson;

public class PersonDaoImpl implements IPersonDao {

	@Override
	public void savePerson() {
		System.out.println("调用了PersonDaoImpl中的savePerson方法");
		System.out.println("save person in PersonDaoImpl");
	}
	
}
