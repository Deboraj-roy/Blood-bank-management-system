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
public class ManageMedsDaoImpl implements ManageMedsDao {

    private final SessionFactory sessionFactory;

    public ManageMedsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Medicine> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<Medicine> medsQuery = session.createQuery("from Medicine", Medicine.class);
        List<Medicine> meds = medsQuery.getResultList();
        return meds == null ? new ArrayList<Medicine>() : meds;
    }

    @Override
    public void save(Medicine medicine) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(medicine);
    }

    @Override
    public Medicine get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Medicine.class, id);
    }

    @Override
    public void save(Blood blood) {

    }

    @Override
    public void update(Medicine medicine) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(medicine);
    }

    @Override
    public void delete(int id) {
        Medicine medicine = get(id);
        sessionFactory.getCurrentSession().delete(medicine);
    }

    @Override
    public List<Medicine> getAll(String medsname) {
        Session session = sessionFactory.getCurrentSession();
        Query<Medicine> medsQuery = session.createQuery("from medicine where medsname like '%" + medsname + "%'", Medicine.class);
        return medsQuery.getResultList();
    }
}
