/**
 * 
 */
package com.codespy.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codespy.airline.models.SeatStatus;

/**
 * @author CodeSpy
 *
 */
@Repository
public interface SeatStatusRepository extends JpaRepository<SeatStatus, Integer> {

	public SeatStatus findByFlightid(int flightid);

}
