package com.fdmgroup.FifteenQuestions;

public class TheMainClass extends FirstAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealClass MainObject = new RealClass();
		
		MainObject.Restore(); 
		
		MainObject.Name = "Guybrush Threepwood";
		System.out.println(MainObject.Name);
		
		NotSoRealClass SecondaryObject = new NotSoRealClass();
		
		
	}

	@Override
	void AbstergoOrganization() {
		// TODO Auto-generated method stub
		
	}

}
