package com.mastercard.connectedcities.test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mastercard.connectedcities.application.ConnectedCitiesApplication;

/**
 * Test class fr the Commandine runner.
 * @author Rahul Landge
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ConnectedCitiesApplication.class)
public class ConnectedCitiesApplicationTest {

	@Autowired
	private CommandLineRunner clr;

	@Test
	public void connectedCities() throws Exception {
		this.clr.run();

	}

}