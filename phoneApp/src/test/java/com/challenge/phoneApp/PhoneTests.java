package com.challenge.phoneApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.challenge.phoneAppCatalog.Phone;
import com.challenge.phoneAppCatalog.PhoneAppApplication;

//@RunWith(SpringJUnit4ClassRunner.class)

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhoneAppApplication.class)
public class PhoneTests {
	@Test(expected = Exception.class)
	public void PhoneNameNullTest(){
		Phone phone= new Phone(null,"TestDescription",null,0);
	}
	
}
