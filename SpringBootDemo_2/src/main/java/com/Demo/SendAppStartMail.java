package com.Demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendAppStartMail implements CommandLineRunner {
	
	/*
	 * public void run(String args) throws Exception {
	 * System.out.println("Sending Mail..."); }
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending Mail...");
		
	}

}
