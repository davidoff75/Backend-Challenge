package com.challenge.phoneApp;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.challenge.phoneAppCatalog.PhoneAppApplication;


//Unit tests have not been created in the current version, because the entity  and controller classes are trivial

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhoneAppApplication.class)
@AutoConfigureMockMvc
public class PhoneTests {
	
    @Autowired
    private MockMvc mockMvc;
    
	TestRestTemplate restTemplate= new TestRestTemplate();
	
	@Test
    public void retrievePhoneIT() throws Exception {
        mockMvc.perform(get("/phones/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id",is(1)));
	}
	
	
	/*
	  TO-DO: 
	    -Create tests to check that validations are working (not null fields, and Min and Max constraints)
	    -Create more IT for the rest of methods
	*/
}
