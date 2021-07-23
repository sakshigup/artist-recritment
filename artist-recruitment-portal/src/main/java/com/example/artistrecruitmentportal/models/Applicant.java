package com.example.artistrecruitmentportal.models;

import javax.persistence.*;

@Entity
@Table(name = "APPLICANT")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private transient String confirm_password;
    private String typeOfProfile;
    private int yearsOfExperience;
    private int payPerShift;
    private String location;

    public Applicant(){}

    public Applicant(String firstName, String lastName, String email, String password, String typeOfProfile, int yearsOfExperience, int payPerShift, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.typeOfProfile = typeOfProfile;
        this.yearsOfExperience = yearsOfExperience;
        this.payPerShift = payPerShift;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public String getTypeOfProfile() {
        return typeOfProfile;
    }

    public void setTypeOfProfile(String typeOfProfile) {
        this.typeOfProfile = typeOfProfile;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getPayPerShift() {
        return payPerShift;
    }

    public void setPayPerShift(int payPerShift) {
        this.payPerShift = payPerShift;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
