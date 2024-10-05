package com.ak.springJDBC;

import com.ak.springJDBC.model.Alien;
import com.ak.springJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {


	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1=context.getBean(Alien.class);
		alien1.setId(11);
		alien1.setName("Abhay");
		alien1.setTech("Java");

		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.println(repo.findAll());



	}

}
