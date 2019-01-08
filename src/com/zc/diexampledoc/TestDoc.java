package com.zc.diexampledoc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * example doc项目中的测试代码
 * 
 * @author zcAsus
 *
 */
public class TestDoc {

	@Test
	public void test() {
		DocumentManager docManager = new DocumentManager();
		IDocument doc = new WordDocument();
		docManager.setDoc(doc);
		docManager.read();
		docManager.write();
	}
	
	@Test
	public void test2() {
		IDocument doc=new PdfDocument();
		doc.read();
		doc.write();
	}
	

	@SuppressWarnings("resource")
	@Test
	public void testSpring() {
		// 下述xml的地址应该是斜杠还是点？？
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zc/exampledoc/contextDoc.xml");
		IDocument doc = (IDocument) context.getBean("excelDoc");
		doc.read();
		doc.write();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void testSpring2() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/exampledoc/contextDoc.xml");
		DocumentManager docManager=(DocumentManager) context.getBean("docManager");
		docManager.write();
		docManager.read();
		
	}

}
