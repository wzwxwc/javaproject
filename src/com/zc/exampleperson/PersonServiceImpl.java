package com.zc.exampleperson;

public class PersonServiceImpl implements IPersonService {

	private IPersonDao personDao;
	
	
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}


	@Override
	public void savePerson() {
		System.out.println("调用了PersonServiceImpl中的savePerson方法");
		this.personDao.savePerson();
	}

}
