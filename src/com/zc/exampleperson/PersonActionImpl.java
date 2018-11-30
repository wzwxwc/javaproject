package com.zc.exampleperson;

public class PersonActionImpl implements IPersonAction{

	private IPersonService personService; 
	@Override
	public void savePerson() {
		this.personService.savePerson();
	}

}
