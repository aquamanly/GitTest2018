package com.fdmgroup.pensions.task3;

public class View {
	public static void printEligible(Person person) {
		System.out.println(person.firstName + " " + person.lastName + " may qualify for a pension this year.");
	}
	
	public static void printIneligible(Person person) {
		System.out.println(person.firstName + " " + person.lastName + " is not old enough yet.");
	}
}
