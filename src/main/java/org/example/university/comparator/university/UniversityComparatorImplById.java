package org.example.university.comparator.university;

import org.example.university.University;
import org.apache.commons.lang3.StringUtils;
import org.example.university.comparator.UniversityComparator;

public class UniversityComparatorImplById implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getId(), o2.getId(), true);
    }
}
