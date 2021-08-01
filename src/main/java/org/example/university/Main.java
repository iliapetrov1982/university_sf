package org.example.university;

import org.example.university.comparator.ComparatorSelection;
import org.example.university.comparator.StudentComparator;
import org.example.university.comparator.StudentComparatorEnum;
import org.example.university.comparator.UniversityComparator;
import org.example.university.comparator.UniversityComparatorEnum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = FileReader.getInstance();

        List<UniversityComparator> universityComparators = new ArrayList<>();
        universityComparators.add(ComparatorSelection.getUniversityComparator(UniversityComparatorEnum.BY_ID));
        universityComparators.add(ComparatorSelection.getUniversityComparator(UniversityComparatorEnum.BY_FULL_NAME));
        universityComparators.add(ComparatorSelection.getUniversityComparator(UniversityComparatorEnum.BY_SHORT_NAME));
        universityComparators.add(ComparatorSelection.getUniversityComparator(UniversityComparatorEnum.BY_YEAR_OF_FOUNDATION));
        universityComparators.add(ComparatorSelection.getUniversityComparator(UniversityComparatorEnum.BY_STUDY_PROFILE));

        List<University> universities = fileReader.getUniversities();

        universityComparators.stream().forEach(
                comparator -> {
                    universities.stream()
                            .sorted(comparator)
                            .forEach(System.out::println);
                    System.out.println();
                }
                );

        List<StudentComparator> studentComparators = new ArrayList<>();
        studentComparators.add(ComparatorSelection.getStudentComparator(StudentComparatorEnum.BY_FULL_NAME));
        studentComparators.add(ComparatorSelection.getStudentComparator(StudentComparatorEnum.BY_UNIVERSITY_ID));
        studentComparators.add(ComparatorSelection.getStudentComparator(StudentComparatorEnum.BY_CURRENT_COURSE_NUMBER));
        studentComparators.add(ComparatorSelection.getStudentComparator(StudentComparatorEnum.BY_AVG_EXAM_SCORE));

        List<Student> students = fileReader.getStudents();

        studentComparators.stream().forEach(
                comparator -> {
                    students.stream()
                            .sorted(comparator)
                            .forEach(System.out::println);
                    System.out.println();
                }
        );
    }
}