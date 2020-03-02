package com.mastercard.connectedcities.test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.mastercard.connectedcities.controller.ConnectedCitiesController;
import com.mastercard.connectedcities.service.ConnectedCitiesService;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class ConnectedCitiesControllerTest {
	@InjectMocks
	ConnectedCitiesController connectedCitiesController;

	@Mock
	ConnectedCitiesService connectedCitiesService;

	@Test
	public void testAreCitiesConnected() throws UnsupportedEncodingException {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(connectedCitiesController.connectedCities(any(String.class), any(String.class))).thenReturn(true);
		boolean responseEntity = connectedCitiesController.connectedCities("Newark", "Boston");
		assertThat(responseEntity).isEqualTo(true);

	}

}