package com.mastercard.connectedcities.test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mastercard.connectedcities.service.ConnectedCitiesService;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class ConnectedCitiesServiceTest {
	
	@Mock
	ConnectedCitiesService connectedCitiesService;

	@Test
	public void testareCitiesConnected() throws UnsupportedEncodingException {
				when(connectedCitiesService.areTheCitiesConnected(any(String.class), any(String.class))).thenReturn(true);
		boolean responseEntity = connectedCitiesService.areTheCitiesConnected("Newark", "Boston");
		assertThat(responseEntity).isEqualTo(true);

	}

}