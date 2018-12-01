package com.zc.exampleperson;

public class PersonActionImpl implements IPersonAction{
	
	public PersonActionImpl(IPersonService personService) {
		this.personService=personService;
	}

	private IPersonService personService; 
	@Override
	public void savePerson() {
		System.out.println("调用了PersonActionImpl中的savePerson方法");
		this.personService.savePerson();
	}

}
