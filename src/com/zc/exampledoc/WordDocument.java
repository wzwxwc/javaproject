package com.zc.exampledoc;

public class WordDocument implements IDocument{

	@Override
	public void read() {
		System.out.println("read word");
	}

	@Override
	public void write() {
		System.out.println("write word");
	}

}
