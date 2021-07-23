package com.example.artistrecruitmentportal.service;

import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import com.example.artistrecruitmentportal.repository.JobRepository;
import com.example.artistrecruitmentportal.repository.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RecruitmentService {

    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    JobRepository jobRepository;

    public Recruiter registerRecruiter(Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }


    public ResponseEntity<String> loginRecruiter(String email, String password) {
        return new ResponseEntity<>("Recruiter logged in successfully", HttpStatus.OK);
    }

    public ResponseEntity<Long> budgetCalculator(int budget, String profileType, String applicant) {
        return new ResponseEntity<>(new Long(1L), HttpStatus.OK);

    }
}
