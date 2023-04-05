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

import com.merchant.insurance.entity.Claim;
import com.merchant.insurance.services.ClaimService;

@RestController
@RequestMapping("/api")
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@GetMapping("/claims")
	public List<Claim> getAllClaims() {
		return claimService.getAllClaims();
	}

	@GetMapping("/claims/{id}")
	private Claim getClaimById(@PathVariable("id") int id) {
		return claimService.getClaimById(id);
	}

	@PostMapping("/claims")
	private int savePolicy(@RequestBody Claim claim) {
		claimService.saveOrUpdate(claim);
		return claim.getId();
	}
	
	@PutMapping("/claims/{id}")
	private int updateClaimById(@PathVariable("id") int id, @RequestBody Claim claim) {
		claim.setId(id);
		claimService.saveOrUpdate(claim);
		return claim.getId();
	}

	@DeleteMapping("/claims/{id}")
	private void deleteClaimById(@PathVariable("id") int id) {
		claimService.delete(id);
	}

}
