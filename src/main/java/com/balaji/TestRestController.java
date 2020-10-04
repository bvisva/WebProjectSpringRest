package com.balaji;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@RestController
@RequestMapping("/")
public class TestRestController {
	
	//@RequestMapping("/welcome")
	@RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String welcome() {//Welcome page, non-rest
		System.out.println("I am in welcome");
        return "Welcome to RestTemplate Example.";
    }
	
	@RequestMapping(value = "/alien", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Alien getAlien() {
		System.out.println("I am in Alien");
    	Alien a1 = new Alien();
    	a1.setAlienId(1);
    	a1.setAlienName("Balaji");
    	a1.setAlienPoints(100);
    	 //ObjectMapper mapper = new ObjectMapper();
         //Converting the Object to JSONString
         
        
        return a1; 
    }
 
	/*@RequestMapping(value = "/alien", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getAlien() throws JsonProcessingException {
		System.out.println("I am in Alien");
    	Alien a1 = new Alien();
    	a1.setAlienId(1);
    	a1.setAlienName("Balaji");
    	a1.setAlienPoints(100);
    	 ObjectMapper mapper = new ObjectMapper();
         //Converting the Object to JSONString
         
        
        return mapper.writeValueAsString(a1); 
    }*/

}
