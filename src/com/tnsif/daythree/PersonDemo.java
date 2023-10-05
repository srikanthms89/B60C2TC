package com.tnsif.daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//scanner object to accept user inputs
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("enter the person name: ");
		name =ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println(" Enter the gender:");
		String gender = ob.next();
		System.out.println("Enter taxable income:  ");
		int income = ob.nextInt();
		
		
		//Person  object  and initiate values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details using tostring() method
		System.out.println(person);
		
		
		Taxcalculation  calc = new Taxcalculation();
		calc.calculateTax(person); // tax calculation
		System.out.println("After calculation tax");
		System.out.println(person);
		

	}

}
