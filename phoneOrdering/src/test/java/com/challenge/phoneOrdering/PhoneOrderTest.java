package com.challenge.phoneOrdering;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class PhoneOrderTest {

	@Mock
	private  PhoneOrderingRepository phoneOrderingRepo;
	
	@Before
    public void setUp() throws Exception {
            MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void allTest() {
		//This test the controller all method, mocking the repository
		PhoneOrderingController phoneOrderingController= new PhoneOrderingController(phoneOrderingRepo);
		when(phoneOrderingRepo.findAll()).thenReturn (new ArrayList<PhoneOrder>());
		List<PhoneOrder> allPhonesEntity= phoneOrderingController.all();
		verify(phoneOrderingRepo, times(1)).findAll();
		assertEquals(0,allPhonesEntity.size());
	}

	
	
	@Test
	public void CalcPriceTest() {
		//This tests the controller calcPrice method
		//Precondition: there are 2 phones in the catalog, with ids 1 and 2, and prices 124 and 609
		
		//Initialization of objects:
		ArrayList<Long> phones= new ArrayList<Long>();
		phones.add((long) 1);
		phones.add((long) 2);
		PhoneOrder phoneOrder= new PhoneOrder("TestName","TestSurname","test@test.com",phones);
		
		phoneOrder.calcPrice();
		assertEquals(phoneOrder.getPrice(),124+609);
	}

}
