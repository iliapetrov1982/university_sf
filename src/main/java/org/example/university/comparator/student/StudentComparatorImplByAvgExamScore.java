package org.example.university.comparator.student;

import org.example.university.Student;
import org.example.university.comparator.StudentComparator;


public class StudentComparatorImplByAvgExamScore implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {

        return Float.compare(o1.getAvgExamScore(), o2.getAvgExamScore());
    }
}
