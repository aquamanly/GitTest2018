package com.fdmgroup.pensions.task3;

public class PensionLogic {
	
	public static boolean isPensionable(Person person, String year) {

		int personYear = person.dateOfBirth.length() - 4;
		String personYearReal = person.dateOfBirth.substring(personYear);
		
		
		if (Integer.parseInt(year) - Integer.parseInt(personYearReal) >=
				65) {
			View.printEligible(person);
		} else {
			View.printIneligible(person);
		}
		
		return false;
		
	}
	
	
}
