package com.core.plainboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.plainboot.services.service1.Service1;


@RestController
@RequestMapping("/test")
public class FirstController {
	
	@Autowired
	Service1 service1;
	
	@GetMapping("/req")
	public String getContent() {
		return "Hello";
	}
	
	@GetMapping("/withheader")
	public ResponseEntity<String> getContent(@RequestHeader HttpHeaders httpHeaders){
		System.out.println("httpHeaders:::"+httpHeaders);
		 return ResponseEntity.status(HttpStatus.OK)
			        .body("Got here:::"+service1.getData(httpHeaders));
	}
}
