package com.zc.iocstudy;

import java.util.List;

public class Hello {

	List<String> lstName;

	public List<String> getLstName() {
		return lstName;
	}

	public void setLstName(List<String> lstName) {
		this.lstName = lstName;
	}

	public void say() {
		System.out.println("你好，我是Hello");
	}

}
