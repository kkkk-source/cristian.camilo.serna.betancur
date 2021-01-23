package co.edu.udea.microserviciosudearegistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping( path = "/hello" )
    public String sayHello()
    {
	    return "Hola desde el mundo Spring Boot";
    }
}
