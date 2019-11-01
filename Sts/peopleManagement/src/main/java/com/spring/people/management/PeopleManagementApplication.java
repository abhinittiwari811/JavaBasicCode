package com.spring.people.management;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.people.management.entity.Person;
import com.spring.people.management.service.PeopleService;

@SpringBootApplication
public class PeopleManagementApplication implements CommandLineRunner {
     @Autowired
	private PeopleService peopleService;
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementApplication.class, args);
	
		
		
	}

	@Override
	public void run(String... args) throws Exception {

		getPersonInfoByName();
	}

	private void getPersonInfoByName() {
		List<Person> personList=peopleService.getPersonInfoByName("abhi tiwari");
		personList.forEach(System.out::println);
		
	}

}
