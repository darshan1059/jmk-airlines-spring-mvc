/**
 * 
 */
package com.codespy.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codespy.airline.models.Airport;

/**
 * @author CodeSpy
 *
 */
@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
	
	public Airport findByid(Integer id);
	
	public Airport findByflightidAndCity(Integer flightid, String city);

}
