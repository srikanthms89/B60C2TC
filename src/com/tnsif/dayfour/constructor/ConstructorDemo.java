package com.tnsif.dayfour.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String name, city;
		int id;
		System.out.println("Enter the cus id: ");
		id= sc.nextInt();
		
		System.out.println("Enter the cus name: ");
		name= sc.next();
		
		System.out.println("Enter the cus city: ");
		city= sc.next();
		
		//default constructor
		Customer c1 = new Customer();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		//parameterized
		Customer c2 =new Customer(name,id ,city);
		System.out.println(c2);
		sc.close();
	}

}
