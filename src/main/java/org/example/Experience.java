package org.example;
public class Experience {
    private String title;
    private String company;
    private String location;
    private String startDate;
    private String endDate;
    private String description;

    public Experience(String title, String company, String location,
                      String startDate, String endDate, String description) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }
}
