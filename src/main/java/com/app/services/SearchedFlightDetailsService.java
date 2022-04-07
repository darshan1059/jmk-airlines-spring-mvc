package com.app.services;

import org.springframework.stereotype.Service;

import com.app.pojos.FlightDetails;
import com.app.pojos.Search;
import com.app.pojos.SearchedFlightDetails;
import com.app.pojos.Seat;

/**
 * 
 * @author CodeSpy
 *
 */

@Service
public interface SearchedFlightDetailsService {
	
	public SearchedFlightDetails getSearchDetails(Search search);
	public SearchedFlightDetails saveFlightAndSeat(FlightDetails flight, Seat seat);
}
