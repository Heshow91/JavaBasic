package oop;
// inheritance example
public class Bmw extends Car{

	public int getHorsePower() {
		int newHp = horsepower;
		return newHp;
	}
	
	public void testMethodBmw() {
		testMethodCars();
		System.out.println(" from bmw");
	}
	// Method overriding 
	//Overriding - @Override
	public void polymorphismTest() {
		System.out.println("Bmw Class");
	}
	// to print the values we need the objects, stored the values from the getHorsePowers
	public static void main(String[] args) {
		Bmw bmw = new Bmw();
		int storingVariable = bmw.getHorsePower();
		
		System.out.println(storingVariable);
		System.out.println(storingVariable+100);
		
		System.out.println(bmw.getHorsePower());
		System.out.println(bmw.getHorsePower()+100);
		
		bmw.testMethodBmw();
		bmw.testMethodCars();
		
		bmw.polymorphismTest();
	}

}
