package com.challenge.phoneApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.challenge.phoneAppCatalog.PhoneAppApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhoneAppApplication.class)
public class PhoneAppApplicationTests {

	//Only to test that the Spring context is loaded
	@Test
	public void contextLoads() {
		assert(true);
	}
}
