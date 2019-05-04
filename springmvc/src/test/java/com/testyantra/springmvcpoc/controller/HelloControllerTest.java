package com.testyantra.springmvcpoc.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ModelMap;

public class HelloControllerTest {

	@Test
	public void printHelloTest() {
		ModelMap model = new ModelMap();
		HelloController cntrl = new HelloController();
		assertEquals( "hello", cntrl.printHello(model) );
	}
	
}
