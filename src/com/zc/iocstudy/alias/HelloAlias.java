package com.zc.iocstudy.alias;

import java.util.ArrayList;
import java.util.List;

public class HelloAlias {

	List<String> lstNames=new ArrayList<String>();

	public List<String> getLstNames() {
		return lstNames;
	}

	public void setLstNames(List<String> lstNames) {
		this.lstNames = lstNames;
	}

	public void say() {
		System.out.println("你好，我是HelloAlias");
	}

}
