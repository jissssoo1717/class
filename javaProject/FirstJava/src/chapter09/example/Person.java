package chapter09.example;

import java.util.Objects;

public class Person {
	
	String name;
	String personNumber;
	

	public Person() {}


	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = null;
		if(obj instanceof Person) {
			p = (Person) obj;
		}
		
		if(p != null && this.personNumber.equals(p.personNumber)) {
			return true;
		}
		
		return false;
	}
	
	
	
}
