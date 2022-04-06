/**
 * 
 */
package com.codespy.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codespy.airline.models.User;

/**
 * @author CodeSpy
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		public User findByUsername(String username);
}