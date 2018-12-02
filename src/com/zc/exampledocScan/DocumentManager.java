package com.zc.exampledocScan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("docManager")
public class DocumentManager {
	
	@Resource(name = "wordDocument")
	private IDocument doc;

	public void read() {
		this.doc.read();
	}

	public void write() {
		this.doc.write();
	}

}
