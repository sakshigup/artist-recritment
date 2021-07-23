package com.example.artistrecruitmentportal.repository;

import com.example.artistrecruitmentportal.models.Job;
import com.example.artistrecruitmentportal.models.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Integer> {


}
