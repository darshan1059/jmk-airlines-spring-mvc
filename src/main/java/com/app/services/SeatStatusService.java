/**
 * 
 */
package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojos.SeatStatus;

/**
 * @author CodeSpy
 *
 */
@Service
public interface SeatStatusService {
	
	public SeatStatus getSeatStatusOfFlight(int flightid);
	public List<SeatStatus> getAllSeatStatus();
	public SeatStatus saveSeatStatus(SeatStatus seatstatus);
	public void deleteSeatStatus(SeatStatus seatstatus);
}
