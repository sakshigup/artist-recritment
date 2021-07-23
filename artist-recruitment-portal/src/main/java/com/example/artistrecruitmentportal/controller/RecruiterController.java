package com.example.artistrecruitmentportal.controller;

import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import com.example.artistrecruitmentportal.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/recruiter")
public class RecruiterController {

    private final static Logger LOGGER = Logger.getLogger(RecruiterController.class.getName());

    @Autowired
    private RecruitmentService recruitmentService;

    @RequestMapping("/register")
    public Recruiter register(@RequestBody Recruiter recruiter)
    {
        return recruitmentService.registerRecruiter(recruiter);
    }

    @RequestMapping("/login")
    public ResponseEntity<String> login (@PathVariable("email") String email, @PathVariable("password") String password)
    {
        return recruitmentService.loginRecruiter(email, password);
    }

    @RequestMapping("/createJob")
    public Job postJob(@RequestBody Job job)
    {
        return recruitmentService.saveJob(job);
    }

    @RequestMapping("/budgetCalculator")
    public ResponseEntity<Long> budgetCalculator(@RequestBody int budget, String profileType, String applicant)
    {
        return recruitmentService.budgetCalculator(budget, profileType, applicant);
    }


}
