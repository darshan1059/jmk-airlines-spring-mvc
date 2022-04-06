/**
 * 
 */
package com.codespy.airline.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codespy.airline.models.Customer;
import com.codespy.airline.models.FlightDetails;
import com.codespy.airline.models.Seat;
import com.codespy.airline.services.AdminService;
import com.codespy.airline.services.CustomerService;
import com.codespy.airline.services.FlightService;
import com.codespy.airline.services.SeatService;

/**
 * @author CodeSpy
 *
 */
@Transactional
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private CustomerService customerService;

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerService.getAllCustomerDetailsExceptAdmin();
	}

}
