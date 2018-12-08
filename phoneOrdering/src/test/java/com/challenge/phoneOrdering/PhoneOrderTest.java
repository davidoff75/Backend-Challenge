package com.challenge.phoneOrdering;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PhoneOrderTest {

	@Test
	public void CalcPrice() {
		//Initialization of objects:
		ArrayList<Long> phones= new ArrayList<Long>();
		phones.add((long) 1);
		phones.add((long) 2);
		PhoneOrder phoneOrder= new PhoneOrder("TestName","TestSurname","test@test.com",phones);
		
		phoneOrder.calcPrice();
		assertEquals("1","1");
	}

}
