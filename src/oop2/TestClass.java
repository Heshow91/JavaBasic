package oop2;

public class TestClass {
// have to implement
	public static void main(String[] args) {
		RunableCar runableCar = new RunableCar();
		
		runableCar.brake();
		runableCar.start();
		runableCar.stop();
		runableCar.wheels();
		runableCar.name();
	
		LucidAir lucidAir = new LucidAir();
		lucidAir.stop();
	}

}
