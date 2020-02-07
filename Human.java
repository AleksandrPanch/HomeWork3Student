package com.gmail.rezus;

public class Human {

	private String sex;
	private int age;
	private String name;
	private String surname;
	
	public Human(String sex, int age, String name, String surname) {
		super();
		this.sex = sex;
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String isSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	
	public void getVoice() {

}

	@Override
	public String toString() {
		return "Human [sex=" + sex + ", age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}

	
}
