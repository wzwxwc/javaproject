package com.zc.exampledoc;

public class DocumentManager {
	private IDocument doc;
	
	public DocumentManager() {
		
	}

	public DocumentManager(IDocument doc) {
		this.doc = doc;
	}

	public void setDocument(IDocument doc) {
		this.doc = doc;
	}

	public void read() {
		this.doc.read();
	}

	public void write() {
		this.doc.write();
	}

}
