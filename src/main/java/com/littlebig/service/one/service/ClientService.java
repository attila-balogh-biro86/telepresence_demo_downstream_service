package com.littlebig.service.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.littlebig.service.one.data.Client;
import com.littlebig.service.one.data.ClientRepository;

/**
 * The type User service.
 */
@Service
public class ClientService {

  private final ClientRepository clientRepository;

  @Autowired
  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  @Transactional
  public Iterable<Client> getAll() {
    return clientRepository.findAll();
  }


  @Transactional
  public void save(Client user) {
    clientRepository.save(user);
  }

  @Transactional
  public Client findOne(Long id) {
    return clientRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("User not found with given ID"));
  }
}