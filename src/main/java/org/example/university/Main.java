package org.example.university;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = FileReader.getInstance();

        List<University> universities = fileReader.getUniversities();
        for (University university : universities) {
            System.out.println(university);
        }

        List<Student> students =  fileReader.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}