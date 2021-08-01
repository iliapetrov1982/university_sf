package org.example.university.comparator.student;

import org.apache.commons.lang3.StringUtils;
import org.example.university.Student;
import org.example.university.comparator.StudentComparator;


public class StudentComparatorImplByUniversityId implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {

        return StringUtils.compare(o1.getUniversityId(), o2.getUniversityId(), true);
    }
}
