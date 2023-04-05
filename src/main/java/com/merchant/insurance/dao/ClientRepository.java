package com.merchant.insurance.dao;

import org.springframework.data.repository.CrudRepository;

import com.merchant.insurance.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
