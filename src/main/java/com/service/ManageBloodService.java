package com.service;

import com.model.Blood;
import com.model.Medicine;

import java.util.List;

public interface ManageBloodService {

    public List<Blood> getAll();

    public void save(Blood blood);

    public Blood get(int id);

    public void update(Blood blood);

    public void delete(int id);

    public List<Blood> getAll(String BloodId);
}
