package com.example.artistrecruitmentportal.service;

import com.example.artistrecruitmentportal.models.Applicant;
import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import com.example.artistrecruitmentportal.repository.ApplicantRepository;
import com.example.artistrecruitmentportal.repository.JobRepository;
import com.example.artistrecruitmentportal.repository.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Applicant registerApplicant(Applicant applicant) {
        applicant.setPassword(passwordEncoder.encode(applicant.getPassword()));
        return applicantRepository.save(applicant);
    }

    public ResponseEntity<String> loginApplicant(String email, String password) {
        return new ResponseEntity<>("Applicant logged in successfully", HttpStatus.OK);
    }

    public ResponseEntity<Job> getJobByLocation(String location)
    {
        Job job = jobRepository.getJobByLocation(location);
        return new ResponseEntity<>(job, HttpStatus.OK);
    }

}
