package com.fdmgroup.pensions.task3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PensionController Controller = new PensionController();
		
		Person JohnS = new Person();
		Person JaneD = new Person();
		Person FredB = new Person();
		
		JohnS.dateOfBirth = "28/06/1993";
		JaneD.dateOfBirth = "05/01/1950";
		FredB.dateOfBirth = "12/12/1949";
		
		JohnS.lastName = "Smith";
		JaneD.lastName = "Doe";
		FredB.lastName = "Bloggs";

		JohnS.firstName = "John";
		JaneD.firstName = "Jane";
		FredB.firstName = "Fred";
		
		Person[] pArray = new Person[3];
		
		pArray[0] = JohnS;
		pArray[1] = JaneD;
		pArray[2] = FredB;
		
		Controller.handlePensions(pArray);
	}

}
