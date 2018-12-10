package com.challenge.phoneOrdering;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.ArrayList;

import org.springframework.mock.web.MockServletContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhoneOrderingApplication.class)
@ContextConfiguration(classes = MockServletContext.class)

public class PhoneOrderingControllerTest {

	@InjectMocks
	PhoneOrderingController phoneOrderingController;
	
	@Mock
	private  PhoneOrderingRepository phoneOrderingRepo;
	
	private MockMvc mockMvc;
	
	@Before
    public void setUp() throws Exception {
            MockitoAnnotations.initMocks(this);
            mockMvc = standaloneSetup(phoneOrderingController).build();
    }
	
	@Test
    public void AllTest() throws Exception {
        when(phoneOrderingRepo.findAll()).thenReturn(new ArrayList<PhoneOrder>());
        mockMvc.perform(get("/orders"))
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
	}


	
}
