package com.dao;

import com.model.Client;

import java.util.List;

public interface ClientDao {

    public List<Client> getAll();

    public void save(Client client);

    public Client get(int clientId);

    public void update(Client client);

    public void delete(int clientId);

    public List<Client> getAll(String clientName);
}
