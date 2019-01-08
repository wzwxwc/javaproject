package com.zc.diexampledoc;

public class DocumentManager {
	private IDocument doc;
	
	public DocumentManager() {
		
	}

	public DocumentManager(IDocument doc) {
		this.doc = doc;
	}
	
	public IDocument getDoc() {
		return doc;
	}

	public void setDoc(IDocument doc) {
		this.doc = doc;
	}

	public void read() {
		this.doc.read();
	}

	public void write() {
		this.doc.write();
	}

}
