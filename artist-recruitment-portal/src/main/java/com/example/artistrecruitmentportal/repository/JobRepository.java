package com.example.artistrecruitmentportal.repository;

import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface JobRepository extends JpaRepository<Job, Integer> {
    Job getJobByLocation(String location);
}
