package com.gmail.rezus;

import java.util.Arrays;

public class MyCommissar implements Commissar{

	@Override
    public Student[] selectReservists(Group group) {
        Student[] reservists = new Student[0];
        for (int i = 0; i < group.groupSize()-1; i++) {
            if (group.searchStudent(i+1) != null) {
                if (group.searchStudent(i+1).getAge() > 18 && group.searchStudent(i+1).getSex().equals("male")) {
                    Student[] temp = Arrays.copyOf(reservists,reservists.length + 1);
                    temp[temp.length - 1] = group.searchStudent(i+1);
                    reservists = temp;
                }
            }
        }
        return reservists;
    }

}
