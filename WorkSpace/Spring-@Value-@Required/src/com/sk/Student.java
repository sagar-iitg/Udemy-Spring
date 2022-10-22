package com.sk;

public class Student {

	
	
	private int rollNo;
	private String name;
	private String hobbies;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String hobbies) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.hobbies = hobbies;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", hobbies=" + hobbies + "]";
	}
	
	
	
	
}
