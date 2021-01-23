package co.edu.udea.microserviciosudearegistration.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.microserviciosudearegistration.dto.ContactDto;

@RestController
@RequestMapping( path = "/", produces = MediaType.APPLICATION_JSON_VALUE )
public class ContactApi
{

	@GetMapping( path = "/contact" )
	public ResponseEntity<ContactDto> findMyContact()
	{
		ContactDto me = ContactDto.builder()
			.id(10L).firstName("Cristian Camilo").lastName("Serna Betancur").phoneNumber("3024484995")
			.email("cristian.sernab@udea.edu.co").build();
		return ResponseEntity.ok( me );
	}
}

