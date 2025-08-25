package org.crenofor.basicjava.javacore.classintroduction.test;

import org.crenofor.basicjava.javacore.classintroduction.domain.Student;

public class testStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Xavi";
        student.age = 31;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
