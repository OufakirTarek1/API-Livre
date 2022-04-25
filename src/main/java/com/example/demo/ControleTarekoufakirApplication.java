package com.example.demo;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;
import com.example.demo.service.LivreService;
@SpringBootApplication
public class ControleTarekoufakirApplication implements CommandLineRunner {

	@Autowired
	 private LivreService livreService;
	public static void main(String[] args) {
		
		SpringApplication.run(ControleTarekoufakirApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Livre l1=new Livre(null,"le monde","maison4",new Date(),"tarek",158,"frf151f4",new Date(),true);
		System.out.println("###########################	Insert	###########################################");
		livreService.saveLivre(new Livre(null,"1","maison1",new Date(),"samir",12,"123456789",new Date(),true));
		livreService.saveLivre(new Livre(null,"2","maison2",new Date(),"hassan",300,"123546",new Date(),true));
		livreService.saveLivre(l1);

		
	}
	
}
