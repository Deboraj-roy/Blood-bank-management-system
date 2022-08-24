package com.dao;

import com.model.Blood;
import com.model.Medicine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManageBloodDaoImpl implements ManageBloodDao {

    private final SessionFactory sessionFactory;

    public ManageBloodDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Blood> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<Blood> bloodQuery = session.createQuery("from Blood", Blood.class);
        List<Blood> bloods = bloodQuery.getResultList();
        return bloods == null ? new ArrayList<Blood>() : bloods;
    }


    @Override
    public void save(Blood blood) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(blood);
    }

    @Override
    public Blood get(int id) {
        return null;
    }


    @Override
    public void update(Blood blood) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(blood);
    }

    @Override
    public void delete(int id) {
        Blood blood= get(id);
        sessionFactory.getCurrentSession().delete(blood);
    }

    @Override
    public List<Blood> getAll(String bloodGroup) {
        Session session = sessionFactory.getCurrentSession();
        Query<Blood> bloodQuery = session.createQuery("from blood where bloodGroup like '%" + bloodGroup + "%'", Blood.class);
        return bloodQuery.getResultList();
    }
}
