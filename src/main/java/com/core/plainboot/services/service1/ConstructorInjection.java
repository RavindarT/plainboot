package com.core.plainboot.services.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjection {

	@Autowired
	InjectedObjects injectedObjects;
	
	public ConstructorInjection(InjectedObjects injectedObjects) {
		System.out.println("calling constructor");
		this.injectedObjects =injectedObjects;
	}
	
	public String call() {
		System.out.println("calling constructed injection");
		return injectedObjects.call1();
	}
}
