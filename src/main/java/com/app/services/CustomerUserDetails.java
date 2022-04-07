/**
 * 
 */
package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerRepository;
import com.app.pojos.Customer;
import com.app.security.CustomCustomerUserDetails;

/**
 * @author CodeSpy
 *
 */
@Service
public class CustomerUserDetails implements UserDetailsService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/* System.out.println(username); */
		Customer customer = customerRepository.findByUsername(username);
		if (customer == null) {
			throw new UsernameNotFoundException("User details not found for the user : " + username);
		}
		/* System.out.println(customer.size()); */
		return new CustomCustomerUserDetails(customer);
	}

}
