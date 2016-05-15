package com.thoughtworks.registration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistration {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceRegistration.class).web(true).run(args);
	}
}
