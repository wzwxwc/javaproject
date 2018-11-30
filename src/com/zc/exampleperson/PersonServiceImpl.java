package com.zc.exampleperson;

public class PersonServiceImpl implements IPersonService {

	private IPersonDao personDao;
	@Override
	public void savePerson() {
		this.personDao.savePerson();
	}

}
