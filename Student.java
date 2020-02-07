package com.gmail.rezus;

public class Student extends Human {

	private String group;
	private int course;
	private int recordnb;
	
						
	public Student(String sex, int age, String name, String surname, String group, int course,
			int recordnb) {
		super(sex, age, name, surname);
		this.group = group;
		this.course = course;
		this.recordnb = recordnb;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getRecordnb() {
		return recordnb;
	}
	public void setRecordnb(int recordnb) {
		this.recordnb = recordnb;
	}
	
	@Override
	public void getVoice() {
		System.out.println("Jobs did not finish universities");
	}
	@Override
	public String toString() {
		return "Student [group=" + group + ", course=" + course + ", recordnb=" + recordnb + super.toString();
	}

	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getGroup() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	 
}
