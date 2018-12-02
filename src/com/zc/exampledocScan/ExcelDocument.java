package com.zc.exampledocScan;

import org.springframework.stereotype.Component;

@Component
public class ExcelDocument implements IDocument {

	@Override
	public void read() {
		System.out.println("read excel");
	}

	@Override
	public void write() {
		System.out.println("write excel");
	}

}
