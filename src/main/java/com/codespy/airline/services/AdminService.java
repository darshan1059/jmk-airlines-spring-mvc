/**
 * 
 */
package com.codespy.airline.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codespy.airline.models.Customer;
import com.codespy.airline.models.FlightDetails;
import com.codespy.airline.models.Seat;

/**
 * @author CodeSpy
 *
 */
@Transactional
@Service
public interface AdminService {
	public List<Customer> getAllCustomerDetails();
}
