package com.service;

import com.model.Medicine;
import com.model.User;

import java.util.List;

public interface ManageMedsService {

    public List<Medicine> getAll();

    public void save(Medicine medicine);

    public Medicine get(int id);

    public void update(Medicine medicine);

    public void delete(int id);

    public List<Medicine> getAll(String medsname);
}
