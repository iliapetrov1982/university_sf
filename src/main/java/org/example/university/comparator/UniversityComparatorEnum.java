package org.example.university.comparator;

import org.example.university.comparator.university.UniversityComparatorImplById;
import org.example.university.comparator.university.UniversityComparatorImplByFullName;
import org.example.university.comparator.university.UniversityComparatorImplByShortName;
import org.example.university.comparator.university.UniversityComparatorImplByMainProfile;
import org.example.university.comparator.university.UniversityComparatorImplByYearOfFoundation;

public enum UniversityComparatorEnum { //Strategy pattern
    BY_ID {
        @Override
        public UniversityComparator getComparator() {
            return new UniversityComparatorImplById();
        }
    },
    BY_FULL_NAME {
        @Override
        public UniversityComparator getComparator() {
            return new UniversityComparatorImplByFullName();
        }
    },
    BY_SHORT_NAME {
        @Override
        public UniversityComparator getComparator() {
            return new UniversityComparatorImplByShortName();
        }
    },
    BY_STUDY_PROFILE {
        @Override
        public UniversityComparator getComparator() {
            return new UniversityComparatorImplByMainProfile();
        }
    },
    BY_YEAR_OF_FOUNDATION {
        @Override
        public UniversityComparator getComparator() {
            return new UniversityComparatorImplByYearOfFoundation();
        }
    };

    public abstract UniversityComparator getComparator();
}
