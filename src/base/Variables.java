package base;

public class Variables {

	//Naming Convention:
	//-Package name - Starts with lower case
	//-Class name - Starts with Upper case
	//-
	
	static String Name = "Hisham Raihan ";
	static String email = "mr.hraihan@gmail.com ";
	static String ID =  "3991NY";
	static String brand ="Apple";
	static String model ="MacBook Pro";
	static int production_year = 2019;
		public static void main(String [] args) {
			
			System.out.println(brand);
			System.out.println(model);
			System.out.println(production_year);
			System.out.println(Name);
			System.out.println(email);
			System.out.println(ID);
			System.out.println(Name+ email+ ID);
		}
		
}