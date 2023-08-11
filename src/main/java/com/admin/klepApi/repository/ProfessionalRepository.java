package com.admin.klepApi.repository;

import com.admin.klepApi.domain.HealthPlan;
import com.admin.klepApi.domain.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Integer> {
}
