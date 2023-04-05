package com.merchant.insurance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.insurance.dao.PolicyRepository;
import com.merchant.insurance.entity.Claim;
import com.merchant.insurance.entity.Policy;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	public List<Policy> getAllPolicies() {
		List<Policy> policies = new ArrayList<>();
		policyRepository.findAll().forEach(policies::add);
		return policies;
	}

	public Policy getPolicyById(int id) {
		return policyRepository.findById(id).orElse(new Policy());
	}

	public void saveOrUpdate(Policy policy) {
		policyRepository.save(policy);
	}

	public void delete(int id) {
		policyRepository.deleteById(id);
	}
}
