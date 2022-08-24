package com.service;

import com.dao.ManageBloodDao;
import com.model.Blood;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManageBloodServiceImpl implements ManageBloodService {

    private final ManageBloodDao manageBloodDao;

    public ManageBloodServiceImpl(ManageBloodDao manageBloodDao) {
        this.manageBloodDao = manageBloodDao;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Blood> getAll() {
        return manageBloodDao.getAll();
    }

    @Override
    public void save(Blood blood) {
        manageBloodDao.save(blood);
    }

    @Override
    public Blood get(int id) {
        return manageBloodDao.get(id);
    }

    @Override
    public void update(Blood blood) {
        manageBloodDao.update(blood);
    }

    @Override
    public void delete(int id) {
        manageBloodDao.delete(id);
    }

    @Override
    public List<Blood> getAll(String BloodId) {
        return null;
    }

}
