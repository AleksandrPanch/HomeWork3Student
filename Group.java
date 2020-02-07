package com.gmail.rezus;

import java.util.Arrays;
import java.util.Scanner;

public class Group {

	private Student[] students = new Student[10];

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int groupSize() {
		return students.length;
	}

	public void addStudent(Student student) throws TooMuchStudentException {
		for (int i = 0; i < students.length; i++) {
			if (this.studentsAmount() >= students.length) {
				throw new TooMuchStudentException();

			} else {
				if (students[i] == null) {
					students[i] = student;
					break;

				}
			}
		}
	}

	public void addStudent() throws TooMuchStudentException {
		if (this.studentsAmount() >= students.length) {
			throw new TooMuchStudentException();
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Student's surname");
				String surname = sc.nextLine();
				System.out.println("Enter Student's name");
				String name = sc.nextLine();
				System.out.println("Enter Student's sex");
				String sex = sc.nextLine();
				if (!sex.equals("male") && !sex.equals("female")) {
					while (!sex.equals("male") && !sex.equals("female")) {
						System.out.println("Wrong sex. Try again");
						sex = sc.nextLine();
					}
				}

				System.out.println("Enter Student's age");
				int age = sc.nextInt();
				System.out.println("Enter Student's group");
				String group = sc.nextLine();
				System.out.println("Enter Student's course");
				int course = sc.nextInt();
				System.out.println("Enter Student's recordnb");
				int recordnb = sc.nextInt();
				Student student = new Student();
				students[i] = student;
				break;

			}
		}
	}

	public Student searchStudent(String surname) {
		for (Student s : students) {
			if (s != null && s.getSurname().equals(surname)) {
				return s;
			}
		}
		System.out.println("There is no such student in group");
		return null;

	}

	public Student searchStudent(int number) {
		if (number - 1 >= 0 && number < students.length) {
			return students[number - 1];
		} else {
			System.out.println("Wrong index");
			return null;
		}
	}

	public void deleteStudent(String surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {
				students[i] = null;
				break;
			}

		}
	}

	public int studentsAmount() {
		int counter = 0;
		for (Student s : students) {
			if (s != null) {
				counter++;
			}
		}
		return counter;

	}
	
	public void sortStudents(Parametrs parametr, boolean order) {
		int myOrder=order ? 1 : -1;
		Arrays.sort(this.students, (sOne, sTwo) -> {
            if (sOne == null && sTwo != null) {
                return -myOrder;
            }
            if (sOne != null && sTwo == null) {
                return myOrder;
            }
            if (sOne == null && sTwo == null) {
                return 0;
            }
            if (parametr == Parametrs.surname) {
                return order ? sOne.getSurname().compareTo(sTwo.getSurname()) : -sOne.getSurname().compareTo(sTwo.getSurname());
            }
            if (parametr == Parametrs.sex) {
                return order ? sOne.getSex().compareTo(sTwo.getSex()) : -sOne.getSex().compareTo(sTwo.getSex());
            }
            if (parametr == Parametrs.age) {
                return order ? sOne.getAge() - sTwo.getAge() : sTwo.getAge() - sOne.getAge();
            }
            if (parametr == Parametrs.group) {
                return order ? sOne.getGroup() - sTwo.getGroup() : sTwo.getGroup() - sOne.getGroup();
            }
            return 0;
		});
	}     
	
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Student s : students) {
	            if (s != null) {
	                sb.append(s);
	                sb.append(System.lineSeparator());
	            }
	        }
	        return sb.toString();
	    }
	}	

