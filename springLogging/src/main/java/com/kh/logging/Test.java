package com.kh.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	public static void main(String[] args) {
		/*
		Logger logger =  LoggerFactory.getLogger(Test.class);
		
		logger.debug("디버그 debug");
		logger.info("정보 info ");
		logger.warn("경고 warn ");
		logger.error("에러 error");
		*/
		
		Member m  = new Member();
		//생성자,setter
		m.setName("홍반장");
		m.setAge(20);
		m.setAddress("홍콩");
		m.setPhone("032-989-1132");
		
		Member m2 = new Member("박과장",10,"서울특별시","02-411-2332");
		
		
		Member bm = Member.builder().build(); //기본생성자로 생성
		
		Member bm2 = Member.builder().name("홍길동").phone("010-2222-3333").build();
		
		System.out.println(bm2);
		
		
		
	}
}
