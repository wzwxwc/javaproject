package com.zc.exampledocScan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * example doc项目中的测试代码
 * 
 * @author zcAsus
 *
 */
public class TestDocScan {

	@Test
	public void test() {
		DocumentManager docManager = new DocumentManager();
		IDocument doc = new WordDocument();
//		docManager.setDocument(doc);
//		docManager.read();
//		docManager.write();
	}
		

	
	@SuppressWarnings("resource")
	@Test
	public void testSpring2() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/zc/exampledocScan/contextDocScan.xml");
		DocumentManager docManager=(DocumentManager) context.getBean("docManager");
		docManager.write();
		docManager.read();
		
	}

}
