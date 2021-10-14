package com.domong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml"; //불러오고
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); //설정하고
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		
		myInfo.getInfoPrint(); 
		
		ctx.close();

	}

}
