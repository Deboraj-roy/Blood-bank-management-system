package com.dao;

import com.model.Blood;
import com.model.Medicine;


import java.util.List;

public interface ManageMedsDao {

    public List<Medicine> getAll();

    public void save(Medicine medicine);

    public Medicine get(int id);

    void save(Blood blood);

    public void update(Medicine medicine);

    public void delete(int id);

    public List<Medicine> getAll(String medsname);
}
