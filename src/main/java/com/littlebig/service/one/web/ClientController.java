package com.littlebig.service.one.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.littlebig.service.one.data.Client;
import com.littlebig.service.one.service.ClientService;

@RestController
public class ClientController {

  private final ClientService userService;

  @Autowired
  public ClientController(ClientService userService) {
    this.userService = userService;
  }

  @GetMapping(path = "/clients")
  public Iterable<Client> getAll() {
    return userService.getAll();
  }


}
