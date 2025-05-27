package com.Demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class CacheManager implements ApplicationRunner{
	
		public void run(ApplicationArguments args) {
			System.out.println("Load data into cache..");
			
		}
	}
