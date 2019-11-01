package com.spring.people.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.people.management.dao.PeopleDao;
import com.spring.people.management.entity.Person;

@Service
public class PeopleService {
	@Autowired
	private PeopleDao peopleDao;
	
	

	public Person getPerson(Person person) {
		return peopleDao.save(person);
	}
	public Optional<Person> read(Integer id) {
		return peopleDao.findById(id);
	}
	public Iterable<Person> allList() {
		return peopleDao.findAll();
	}
	public void deletByiD(Integer id) {
		 peopleDao.deleteById(id);

	}
	
}
