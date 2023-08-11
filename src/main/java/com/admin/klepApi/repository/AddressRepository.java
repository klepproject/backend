package com.admin.klepApi.repository;

import com.admin.klepApi.domain.Address;
import com.admin.klepApi.domain.HealthPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
