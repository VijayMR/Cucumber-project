package org.running;

import org.baseclass.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookesclass {
	
	@After
	public void tc01() {
		System.out.println("after scenario");
		Base.quit();

	}
	@Before
	public void tc02() {
		System.out.println("before scenario");
		

	}

}
