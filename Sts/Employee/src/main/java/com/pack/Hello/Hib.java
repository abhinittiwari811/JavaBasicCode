package com.pack.Hello;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="hib3")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Hib {
	
	private EmpName ename;
	@Override
	public String toString() {
		return "Hib [ename=" + ename + ", id=" + id + ", salary=" + salary + "]";
	}
	public EmpName getEname() {
		return ename;
	}
	public void setEname(EmpName ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Id
	private int id;
	private String salary;

}
