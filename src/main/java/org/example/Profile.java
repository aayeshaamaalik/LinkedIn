package org.example;

import java.util.*;

public class Profile {
    private String summary;
    private List<Experience> experience;
    private List<Education> education;
    private List<Skill> skills;
    private List<Accomplishment> accomplishments;
    private List<Recommendation> recommendations;

    public Profile(String summary) {
        this.summary = summary;
        this.experience = new ArrayList<>();
        this.education = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.accomplishments = new ArrayList<>();
        this.recommendations = new ArrayList<>();
    }

    // Getters
    public String getSummary() {
        return summary;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public List<Education> getEducation() {
        return education;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Accomplishment> getAccomplishments() {
        return accomplishments;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    // Add methods
    public boolean addExperience(Experience exp) {
        return experience.add(exp);
    }

    public boolean addEducation(Education edu) {
        return education.add(edu);
    }

    public boolean addSkill(Skill skill) {
        return skills.add(skill);
    }

    public boolean addAccomplishment(Accomplishment acc) {
        return accomplishments.add(acc);
    }

    public boolean addRecommendation(Recommendation rec) {
        return recommendations.add(rec);
    }
}

