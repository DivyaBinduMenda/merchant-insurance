package com.merchant.insurance.dao;

import org.springframework.data.repository.CrudRepository;

import com.merchant.insurance.entity.Claim;

public interface ClaimRepository extends CrudRepository<Claim, Integer> {

}
