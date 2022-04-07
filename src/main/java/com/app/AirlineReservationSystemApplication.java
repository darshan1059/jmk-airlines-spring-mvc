package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.pojos.PropertyFileReader;

@SpringBootApplication(scanBasePackages = { "com.app.*" })
/*
 * @ComponentScans({ @ComponentScan("com.codespy.airline.security")
 * , @ComponentScan("com.codespy.airline.controller"),
 * 
 * @ComponentScan("com.codespy.airline.services"), @ComponentScan(
 * "com.codespy.airline.services.impl") })
 */
@EnableConfigurationProperties({ PropertyFileReader.class })
@EnableJpaRepositories("com.app.dao")
@EntityScan("com.app.pojos")
public class AirlineReservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineReservationSystemApplication.class, args);
	}

}
