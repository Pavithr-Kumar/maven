package com.zettamine.mis.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zettamine.mis.services.UserServices;

class UserServicesTest {

	@Test
	void test() {
		UserServices services = new UserServices();
		boolean expected =false;
		boolean actual = services.checkEvenOrOdd(1);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		UserServices services = new UserServices();
		boolean expected =true;
		boolean actual = services.checkEvenOrOdd(2);
		assertEquals(expected, actual);
	}
	
	

}
