package org.example.university;

public class Student {
    private final String fullName;
    private final String universityId;
    private final int currentCourseNumber;
    private final float avgExamScore;

    public Student(Builder builder) {
        this.fullName = builder.fullName;
        this.universityId = builder.universityId;
        this.currentCourseNumber = builder.currentCourseNumber;
        this.avgExamScore = builder.avgExamScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String fullName;
        private String universityId;
        private int currentCourseNumber;
        private float avgExamScore;

        private Builder() {

        }

        public Builder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withUniversityId(String universityId) {
            this.universityId = universityId;
            return this;
        }

        public Builder withCurrentCourseNumber(int currentCourseNumber) {
            this.currentCourseNumber = currentCourseNumber;
            return this;
        }

        public Builder withAvgExamScore(float avgExamScor) {
            this.avgExamScore = avgExamScor;
            return this;
        }

        public Student build() {

            return new Student(this);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }
}
