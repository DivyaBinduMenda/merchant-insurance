package com.merchant.insurance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.insurance.entity.Policy;
import com.merchant.insurance.services.PolicyService;

@RestController
@RequestMapping("/api")
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@GetMapping("/policies")
	public List<Policy> getAllPolicies() {
		return policyService.getAllPolicies();
	}

	@GetMapping("/policies/{id}")
	private Policy getPolicyById(@PathVariable("id") int id) {
		return policyService.getPolicyById(id);
	}

	@PostMapping("/policies")
	private int savePolicy(@RequestBody Policy policy) {
		policyService.saveOrUpdate(policy);
		return policy.getId();
	}
	
	@PutMapping("/policies/{id}")
	private int updatePolicyById(@PathVariable("id") int id, @RequestBody Policy policy) {
		policy.setId(id);
		policyService.saveOrUpdate(policy);
		return policy.getId();
	}

	@DeleteMapping("/policies/{id}")
	private void deletePolicyById(@PathVariable("id") int id) {
		policyService.delete(id);
	}

}
