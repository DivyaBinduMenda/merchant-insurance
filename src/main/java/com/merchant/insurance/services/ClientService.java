package com.merchant.insurance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.insurance.dao.ClientRepository;
import com.merchant.insurance.entity.Claim;
import com.merchant.insurance.entity.Client;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	public List<Client> getAllClients() {
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(clients::add);
		return clients;
	}

	public Client getClientById(int id) {
		return clientRepository.findById(id).orElse(new Client());
	}

	public void saveOrUpdate(Client client) {
		clientRepository.save(client);
	}

	public void delete(int id) {
		clientRepository.deleteById(id);
	}
}
