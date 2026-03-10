package com.restaurant.restaurant_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Service Registry.
 *
 * Purpose:
 * Acts as the central service registry where all microservices
 * register themselves.
 *
 * Why this exists:
 * Enables dynamic service discovery between microservices.
 *
 * How it works:
 * - Microservices register with this server
 * - Eureka keeps track of service instances
 * - Other services discover them dynamically
 */

@SpringBootApplication
@EnableEurekaServer
public class RestaurantServiceRegistryApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantServiceRegistryApplication.class, args);
	}

}
