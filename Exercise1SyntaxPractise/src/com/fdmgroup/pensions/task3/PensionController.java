package com.fdmgroup.pensions.task3;

public class PensionController {
	public void handlePensions(Person[] people) {
		for (Person person : people) {
			PensionLogic.isPensionable(person, "2014");
		}
	}
}
