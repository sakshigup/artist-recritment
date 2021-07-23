package com.example.artistrecruitmentportal.models;

import javax.persistence.*;


@Entity
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titleOfJob;
    private String profile;
    private String location;
    private int monthlySalary;

    public Job(int id, String titleOfJob, String profile, String location, int monthlySalary) {
        this.id = id;
        this.titleOfJob = titleOfJob;
        this.profile = profile;
        this.location = location;
        this.monthlySalary = monthlySalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleOfJob() {
        return titleOfJob;
    }

    public void setTitleOfJob(String titleOfJob) {
        this.titleOfJob = titleOfJob;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
