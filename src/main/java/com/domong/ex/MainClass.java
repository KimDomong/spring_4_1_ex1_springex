package com.domong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml"; //�ҷ�����
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); //�����ϰ�
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		
		myInfo.getInfoPrint(); 
		
		ctx.close();

	}

}