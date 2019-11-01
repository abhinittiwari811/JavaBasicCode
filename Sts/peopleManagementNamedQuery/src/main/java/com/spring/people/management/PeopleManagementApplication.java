package com.spring.people.management;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.people.management.entity.Person;
import com.spring.people.management.service.PeopleService;

@SpringBootApplication
public class PeopleManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(PeopleManagementApplication.class, args);
	PeopleService p=configurableApplicationContext.getBean("peopleService", PeopleService.class);
	Person person=new Person();
		
		 // person.setName("a tiwari"); 
		 // person.setMobile(742363457);
		//  person.setEmail("skessgupta@gmai.com");
		//  person.setCreationDate(new Date());
		 
	//p.getPerson(person);
	p.read(1);
	//System.out.println(p.allList());
	//p.deletByiD((int)1);
	//p.findbyMo(742363457);
	}

}
