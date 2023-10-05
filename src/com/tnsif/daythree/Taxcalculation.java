package com.tnsif.daythree;

public class Taxcalculation {

	public void calculateTax( Person person)
	{
		if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
		}
		else
		{
			if(person.getIncome() <= 160000 ) {
				person.setTax(0);
			}
			else if (person.getIncome()>= 500000 && person.getIncome() <=800000) {
				person.setTax(person.getIncome()- 500000 * 20 / 100 + 34000);
			}
			else if (person.getIncome()>= 800000 && person.getIncome() <=1500000) {
				person.setTax(person.getIncome()- 800000 * 20 / 100 + 45000);
			
		}
			else
			
				person.setTax((person.getIncome()-800000)*30 /100 +94000);
			
		}
	}
}
	
