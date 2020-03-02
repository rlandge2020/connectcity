package com.mastercard.connectedcities.service;

import java.io.UnsupportedEncodingException;
/**
 * Service interface for the Connected cities implementation.
 * @author Rahul Landge
 *
 */
public interface ConnectedCitiesService {
	
	public boolean areTheCitiesConnected(String city1, String city2) throws UnsupportedEncodingException;

}
