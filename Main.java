package com.gmail.rezus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studOne = new Student("male", 18, "Pavel", "Zaika", "finance", 1, 57);
		Student studTwo = new Student("male", 19, "Maksim", "Simonenko", "finance", 1, 86);
        Student studThree = new Student("female", 18, "Tamara", "Nischenko", "finance", 1, 53);
        Student studFour = new Student("male", 18, "Serg", "Krasovski", "finance", 1, 28);
        Student studFive = new Student("male", 20, "Roman", "Panik", "finance", 1, 55);
        Student studSix = new Student("female", 19, "Irina", "Zueva", "finance", 1, 51);
        Student studSeven = new Student("female", 18, "Olga", "Kogut", "finance", 1, 11);
        Student studEight = new Student("male", 18, "Vasilii", "Sad", "finance", 1, 23);
        Student studNine = new Student("male", 19, "Sasha", "Kostirev", "finance", 1, 77);
        Student studTen = new Student("female", 18, "Svetlana", "Chumak", "finance", 1, 19);
        Student studEleven = new Student("male", 19, "Andrei", "Kushnir", "finance", 1, 95);
        
        Group myGroup = new Group();
        try {
            myGroup.addStudent(studOne);
            myGroup.addStudent(studTwo);
            myGroup.addStudent(studThree);
            myGroup.addStudent(studFour);
            myGroup.addStudent(studFive);
            myGroup.addStudent(studSix);
            myGroup.addStudent(studSeven);
            myGroup.addStudent(studEight);
            myGroup.addStudent(studNine);
            myGroup.addStudent();
        } catch (TooMuchStudentException e) {
            e.printStackTrace();
        }
        System.out.println("Without sorting:");
        System.out.println(myGroup);
        System.out.println();
        System.out.println(myGroup);
        System.out.println();
        System.out.println("Age sorting, reverse order:");
        myGroup.sortStudents(Parametrs.age, false);
        System.out.println(myGroup);

        MyCommissar c = new MyCommissar();
        for (Student q:c.selectReservists(myGroup)) {
            System.out.println(q);
        }
    }
	
	}


