package com.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BloodInformation")
public class Blood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "BloodGroup", nullable = false)
    private String bloodGroup;
    @Column(name = "quantity", nullable = false)
    private String quantity;

    @Column(name = "Address", nullable = false)
    private String address;
    @Column(name = "PhoneNumber", nullable = false)
    private String phoneNumber;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getQuantity() {
        return quantity;
    }
}

