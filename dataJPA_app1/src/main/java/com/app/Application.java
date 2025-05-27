package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.entity.Player;
import com.app.repositiry.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	 PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
	//System.out.println(playerRepository.getClass().getName());
	 
	Player p1 = new Player();
	p1.setPlayerId(111);
	p1.setPlayerName("Viany");
	p1.setPlayerAge(26);
	p1.setLocation("Warje");
	
	playerRepository.save(p1); 

	System.out.println("Record Inserted.....");
	}

}
