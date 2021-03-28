package com.puc.sca.bi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * BI
 * @author breno.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ScaBiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ScaBiApplication.class, args);
	}

}

