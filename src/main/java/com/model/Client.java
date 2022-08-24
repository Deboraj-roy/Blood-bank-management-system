package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(name = "client_name", nullable = false)
    private String clientName;
    @Column(name = "blood_group", nullable = false)
    private String bloodGroup;
    @Column(name = "age", nullable = false)
    private String age;
    @Column(name = "address", nullable = false)
    private String address;

    @NotNull
    @Column(name = "nid")
    private String nid;

    @NotNull
    @Column(name = "phone")
    private String phone;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getClientName() {
        return clientName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getClientId() {
        return clientId;
    }

    public String getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


}
