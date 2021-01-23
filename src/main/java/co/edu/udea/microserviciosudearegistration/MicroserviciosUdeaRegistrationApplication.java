package co.edu.udea.microserviciosudearegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviciosUdeaRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUdeaRegistrationApplication.class, args);
	}

}
