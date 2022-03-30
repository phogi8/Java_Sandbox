package com.phogi.sandbox;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int age;
	
	Employee (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() { return this.name; }
	int getAge() { return this.age; }
	
}
