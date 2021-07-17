package org.example.university;

public class Main {
    public static void main(String[] args) {
        University university = University.builder()
                .withId("B11")
                .build();
        Student student = Student.builder()
                .withFullName("ILIA PETROV")
                .withUniversityId("A191")
                .build();
        System.out.println(university);
        System.out.println(student);
    }
}