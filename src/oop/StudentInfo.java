package oop;
// encapsulation example

public class StudentInfo {
// private because we don't want to share sensitive data each user can input their own data in execution tab
	private int age ;
	private String name;
	private String DOB;
	
	//Setter & Getter have to create values before adding instead of being set
	//always create as a public
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name =name;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setDOB (String DOB) {
		this.DOB = DOB;
	}
	
	public String getDOB() {
		return DOB;
	}
	
}
