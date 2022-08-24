package com.model;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "meds_name", nullable = false)
    private String medsname;
    @Column(name = "quantity", nullable = false)
    private String quantity;

    @Column(name = "price", nullable = false)
    private String price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedsname() {
        return medsname;
    }

    public void setMedsname(String medsname) {
        this.medsname = medsname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




}
