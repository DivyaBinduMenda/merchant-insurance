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

import com.merchant.insurance.entity.Client;
import com.merchant.insurance.services.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/clients")
	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}

	@GetMapping("/clients/{id}")
	private Client getClientById(@PathVariable("id") int id) {
		return clientService.getClientById(id);
	}

	@PostMapping("/clients")
	private int saveClient(@RequestBody Client client) {
		clientService.saveOrUpdate(client);
		return client.getId();
	}
	
	@PutMapping("/clients/{id}")
	private int updateClientById(@PathVariable("id") int id, @RequestBody Client client) {
		client.setId(id);
		clientService.saveOrUpdate(client);
		return client.getId();
	}

	@DeleteMapping("/clients/{id}")
	private void deleteClientById(@PathVariable("id") int id) {
		clientService.delete(id);
	}

}
