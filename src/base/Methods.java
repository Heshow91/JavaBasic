package base;

public class Methods {
	
	
		public Methods () {
			
			
		}
		
		String name = "pnt";
		static String age ="0";
		
		public void getName() {
			System.out.println("pnt");
		}
		
		
		
	// non-static method
		//1. void - doesn't return anything
	
			public void testMethodVoid() {
				System.out.println("a");
			
				
				//access_specifier methodType methodName(--params body){--method body starts 
				//
				//method body
				//
				//}-- method body finishes
			}
		//2.return type
			public int testMethodReturn() {
				int a = 100;
				System.out.println(a);
				return a;
			}
		//3.
	
	
	//static method
		//1.void- doesn't return anything
				public static void testStaticMethodVoid() {
					String a ="Hello";
					System.out.println(a);
					
					
				}
		//2.return type
		 static void main(String[] args) {
		// TODO Auto-generated method stub
			 String a ="Hello";
			 System.out.println(a);
		System.out.println("Hello World");
	}
		 
		 //parameterized Methods
		 
		 public void calculator() {
			 int a =10;
			 int b =20;
			 int c =a+b;
			 System.out.println(c);
		 }
		 public void calculator2() {
			 int x =5;
			 int z =10;
			 int y =5*10;
			 System.out.println(y);
		 }

}


