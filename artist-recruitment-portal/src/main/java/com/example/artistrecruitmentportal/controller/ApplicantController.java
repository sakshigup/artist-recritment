package com.example.artistrecruitmentportal.controller;

import com.example.artistrecruitmentportal.models.Applicant;
import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import com.example.artistrecruitmentportal.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {

    private final static Logger LOGGER = Logger.getLogger(RecruiterController.class.getName());

    @Autowired
    ApplicantService applicantService;

    @RequestMapping("/register")
    public Applicant register(@RequestBody Applicant applicant)
    {
        return applicantService.registerApplicant(applicant);
    }

    @RequestMapping("/login")
    public ResponseEntity<String> login (@PathVariable("email") String email, @PathVariable("password") String password)
    {
        return applicantService.loginApplicant(email, password);
    }

    @RequestMapping("/getJobByLocation")
    public ResponseEntity<Job> getJobByLocation(@RequestBody String location)
    {
        return applicantService.getJobByLocation(location);
    }
}
