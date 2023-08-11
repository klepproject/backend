package com.admin.klepApi.repository;

import com.admin.klepApi.domain.HealthPlan;
import com.admin.klepApi.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
