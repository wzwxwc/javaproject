package com.zc.exampledocScan;

import org.springframework.stereotype.Component;

@Component
public class PdfDocument implements IDocument {

	@Override
	public void read() {
		System.out.println("read pdf");
	}

	@Override
	public void write() {
		System.out.println("write pdf");
	}

}
