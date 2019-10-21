package com.etoc.mode.structural.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.etoc.mode.structural.filter.Criteria;
import com.etoc.mode.structural.filter.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
