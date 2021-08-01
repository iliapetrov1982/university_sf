package org.example.university.comparator.student;

import org.example.university.Student;
import org.example.university.comparator.StudentComparator;


public class StudentComparatorImplByCurrentCourseNumber implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {

        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
