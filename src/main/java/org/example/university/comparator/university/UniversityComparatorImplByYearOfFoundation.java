package org.example.university.comparator.university;

import org.example.university.University;
import org.example.university.comparator.UniversityComparator;

public class UniversityComparatorImplByYearOfFoundation implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {

        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}
