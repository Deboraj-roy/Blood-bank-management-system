package com.service;

import com.model.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAll();

    public void save(Client client);



    void saveClient(Client client);

    public Client get(int clientId);

    public void update(Client client);

    public void delete(int clientId);

    public List<Client> getAll(String buyerName);
}
