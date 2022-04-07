/**
 * 
 */
package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.SeatStatus;

/**
 * @author CodeSpy
 *
 */
@Repository
public interface SeatStatusRepository extends JpaRepository<SeatStatus, Integer> {

	public SeatStatus findByFlightid(int flightid);

}
