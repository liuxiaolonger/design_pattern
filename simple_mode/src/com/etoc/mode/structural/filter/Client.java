package com.etoc.mode.structural.filter;

import java.util.ArrayList;
import java.util.List;

import com.etoc.mode.structural.filter.impl.CriteriaFemale;
import com.etoc.mode.structural.filter.impl.CriteriaSingle;
import com.etoc.mode.structural.filter.impl.OrCriteria;

public class Client {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleOrFemale = new OrCriteria(single, female);
		List<Person> meetCriteria = singleOrFemale.meetCriteria(persons);
		printPersons(meetCriteria);
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
