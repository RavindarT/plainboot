package com.core.plainboot.services.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetterSetterInjection {
	
	
	InjectedObjects injectedObjects;

	public InjectedObjects getInjectedObjects() {
		return injectedObjects;
	}

	@Autowired
	public void setInjectedObjects(InjectedObjects injectedObjects) {
		this.injectedObjects = injectedObjects;
	}
	
	public String callgettersetter() {
		injectedObjects.setTest("This is new test");
		return "here:::"+injectedObjects.call1();
	}
	

}
