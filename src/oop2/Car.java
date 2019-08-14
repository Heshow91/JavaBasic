package oop2;

public abstract class Car {
	// able to have a typical method and a method without a body
	public void brake() {
		
		System.out.println("Car has to use brake to stop");
	}
	
	
	public abstract void wheels();
	// declaring method but specifying as abstract
	
	
}
