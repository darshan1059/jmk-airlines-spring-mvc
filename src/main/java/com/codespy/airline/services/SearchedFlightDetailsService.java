package com.codespy.airline.services;

import org.springframework.stereotype.Service;

import com.codespy.airline.models.FlightDetails;
import com.codespy.airline.models.Search;
import com.codespy.airline.models.SearchedFlightDetails;
import com.codespy.airline.models.Seat;

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
