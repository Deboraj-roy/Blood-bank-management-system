package com.service;

import com.dao.ClientDao;
import com.model.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    private final ClientDao clientDao;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> getAll() {
        return clientDao.getAll();
    }

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }

    @Override
    public void saveClient(Client client) {

    }


    @Override
    public Client get(int clientId) {
        return clientDao.get(clientId);
    }

    @Override
    public void update(Client client) {
        clientDao.update(client);
    }

    @Override
    public void delete(int id) {
        clientDao.delete(id);
    }

    @Override
    public List<Client> getAll(String clientName) {
        return clientDao.getAll(clientName);
    }
}
