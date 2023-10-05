package com.tnsif.corejava;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char  x= 'o';
		switch(x)
		{
		case 'l' :
		case 'L':
			System.out.println(x+ " is a letter");
			break;
			
		case 'd' :
		case 'D':
			 System.out.println(x+ " is a digit");
			 break;
		case 'w':
		case 'W':
			System.out.println(x+ " is a word");
			break;
			
		default:
			 System.out.println(x+ "is other than letter ,digit ,word");
			 break;
		}

	}

}
