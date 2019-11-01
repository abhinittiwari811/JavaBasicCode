package com.spring.people.management.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.people.management.entity.Person;
@Repository
public interface PeopleDao extends CrudRepository<Person, Integer>{


	

}
