package org.example.university.comparator;

public class ComparatorSelection {

    private ComparatorSelection() {

    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorEnum comparatorEnum) {
        return comparatorEnum.getComparator();
    }

    public static StudentComparator getStudentComparator(StudentComparatorEnum comparatorEnum) {
        return comparatorEnum.getComparator();
    }
}
