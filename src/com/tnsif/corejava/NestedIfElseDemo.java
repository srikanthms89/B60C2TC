package com.tnsif.corejava;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a=100, b=45, c=500;
		System.out.println("the lagest num is");
		if( a > b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}
			
	}

}
