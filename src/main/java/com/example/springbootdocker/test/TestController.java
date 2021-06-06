package com.example.springbootdocker.test;

import java.util.Date;

import javax.annotation.PostConstruct;

public class TestController {
	
	@PostConstruct
	public void printDate() throws InterruptedException{

		System.out.println(" current date {} "+new Date());
		Thread.sleep(1000);
	}

}