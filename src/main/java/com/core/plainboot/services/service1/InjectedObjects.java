package com.core.plainboot.services.service1;

import org.springframework.stereotype.Service;

@Service
public class InjectedObjects {
	
	String test;
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String call1() {
		return "call1"+":::"+test;
	}
}
