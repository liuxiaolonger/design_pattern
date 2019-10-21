package com.etoc.mode.structural.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.etoc.mode.structural.filter.Criteria;
import com.etoc.mode.structural.filter.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		 List<Person> femalePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            femalePersons.add(person);
	         }
	      }
	      return femalePersons;
	}

}