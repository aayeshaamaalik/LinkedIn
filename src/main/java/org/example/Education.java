package org.example;

public class Education {
    private String school;
    private String degree;
    private String fieldOfStudy;
    private String startDate;
    private String endDate;

    public Education(String school, String degree, String fieldOfStudy,
                     String startDate, String endDate) {
        this.school = school;
        this.degree = degree;
        this.fieldOfStudy = fieldOfStudy;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public String getDegree() {
        return degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}

