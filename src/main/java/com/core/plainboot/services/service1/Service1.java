package com.core.plainboot.services.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Service1 {

	@Value("${com.spring.url}")
	String urlValue;
	
	public String getData(HttpHeaders headers) {
		
		String url = urlValue;
		
		
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result =restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		
		return "Comes here:::"+result.getBody();
	}
}
