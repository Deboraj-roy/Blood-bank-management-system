package com.dao;

import com.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {

    private final SessionFactory sessionFactory;

    public ClientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Client> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<Client>clientQuery = session.createQuery("from Client", Client.class);
        List<Client> clients = clientQuery.getResultList();
        return clients == null ? new ArrayList<Client>() : clients;
    }


    @Override
    public void save(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(client);
    }


    @Override
    public Client get(int clientId) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Client.class, clientId);
    }


    @Override
    public void update(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(client);
    }



    @Override
    public void delete(int clientId) {
        Client client = get(clientId);
        sessionFactory.getCurrentSession().delete(client);
    }

    @Override
    public List<Client> getAll(String clientName) {
        Session session = sessionFactory.getCurrentSession();
        Query<Client> medsQuery = session.createQuery("from client where clientName like '%" + clientName  + "%'", Client.class);
        return medsQuery.getResultList();
    }
}
