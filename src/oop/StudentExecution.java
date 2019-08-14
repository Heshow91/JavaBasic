package oop;
// encapsulation example
public class StudentExecution {

	public static void main(String[] args) {
		
		
		StudentInfo studentInfo = new StudentInfo();
		
		studentInfo.setAge(10);
		int newAge = studentInfo.getAge();
		System.out.println(newAge);
		
		
		studentInfo.setName("Hisham");
		String newName = studentInfo.getName();
		System.out.println(newName);
		
		studentInfo.setDOB("10/01/1991");
		String newDOB = studentInfo.getDOB();
		System.out.println(newDOB);
	}

}
