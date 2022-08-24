package com.service;

import com.dao.ManageMedsDao;
import com.model.Medicine;

import com.model.Medicine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManageMedsServiceImpl implements ManageMedsService {

    private final ManageMedsDao manageMedsDao;

    public ManageMedsServiceImpl(ManageMedsDao manageMedsDao) {
        this.manageMedsDao = manageMedsDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Medicine> getAll() {
        return manageMedsDao.getAll();
    }

    @Override
    public void save(Medicine medicine) {
        manageMedsDao.save(medicine);
    }

    @Override
    public Medicine get(int id) {
        return manageMedsDao.get(id);
    }

    @Override
    public void update(Medicine medicine) {
        manageMedsDao.update(medicine);
    }

    @Override
    public void delete(int id) {
        manageMedsDao.delete(id);
    }

    @Override
    public List<Medicine> getAll(String medsname) {
        return manageMedsDao.getAll(medsname);
    }
}
