package com.merchant.insurance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.insurance.dao.ClaimRepository;
import com.merchant.insurance.entity.Claim;

@Service
public class ClaimService {

	@Autowired
	ClaimRepository claimRepository;

	public List<Claim> getAllClaims() {
		List<Claim> claims = new ArrayList<>();
		claimRepository.findAll().forEach(claims::add);
		return claims;
	}

	public Claim getClaimById(int id) {
		return claimRepository.findById(id).orElse(new Claim());
	}

	public void saveOrUpdate(Claim claim) {
		claimRepository.save(claim);
	}

	public void delete(int id) {
		claimRepository.deleteById(id);
	}
}
