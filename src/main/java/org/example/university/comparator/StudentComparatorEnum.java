package org.example.university.comparator;


import org.example.university.comparator.student.StudentComparatorImplByAvgExamScore;
import org.example.university.comparator.student.StudentComparatorImplByCurrentCourseNumber;
import org.example.university.comparator.student.StudentComparatorImplByFullName;
import org.example.university.comparator.student.StudentComparatorImplByUniversityId;

public enum StudentComparatorEnum { //Strategy pattern
    BY_FULL_NAME {
        @Override
        public StudentComparator getComparator() {

            return new StudentComparatorImplByFullName();
        }
    },
    BY_UNIVERSITY_ID {
        @Override
        public StudentComparator getComparator() {

            return new StudentComparatorImplByUniversityId();
        }
    },
    BY_CURRENT_COURSE_NUMBER {
        @Override
        public StudentComparator getComparator() {

            return new StudentComparatorImplByCurrentCourseNumber();
        }
    },
    BY_AVG_EXAM_SCORE {
        @Override
        public StudentComparator getComparator() {

            return new StudentComparatorImplByAvgExamScore();
        }
    };

    public abstract StudentComparator getComparator();
}
