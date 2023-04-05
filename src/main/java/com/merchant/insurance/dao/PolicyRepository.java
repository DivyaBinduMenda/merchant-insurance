package com.merchant.insurance.dao;

import org.springframework.data.repository.CrudRepository;

import com.merchant.insurance.entity.Policy;

public interface PolicyRepository extends CrudRepository<Policy, Integer> {

}
