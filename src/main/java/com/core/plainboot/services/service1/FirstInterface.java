package com.core.plainboot.services.service1;

public interface FirstInterface {

	 static String getData() {
		return "Getdata";
	}
	 default String getDatafromDefault() {
			return "getdefault";
		}
}
