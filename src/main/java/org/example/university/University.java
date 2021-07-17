package org.example.university;

public class University {
    private final String id;
    private final String fullName;
    private final String shortName;
    private final int yearOfFoundation;
    private final StudyProfile mainProfile;

    public University(Builder builder) {
        this.id = builder.id;
        this.fullName = builder.fullName;
        this.shortName = builder.shortName;
        this.yearOfFoundation = builder.yearOfFoundation;
        this.mainProfile = builder.mainProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String fullName;
        private String shortName;
        private int yearOfFoundation;
        private StudyProfile mainProfile;

        private Builder() {
        }

        public static Builder anUniversity() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder withYearOfFoundation(int yearOfFoundation) {
            this.yearOfFoundation = yearOfFoundation;
            return this;
        }

        public Builder withMainProfile(StudyProfile mainProfile) {
            this.mainProfile = mainProfile;
            return this;
        }

        public University build() {
            return new University(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile +
                '}';
    }
}
