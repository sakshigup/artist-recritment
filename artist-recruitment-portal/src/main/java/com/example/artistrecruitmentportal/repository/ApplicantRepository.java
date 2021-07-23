package com.example.artistrecruitmentportal.repository;

import com.example.artistrecruitmentportal.models.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {

}
