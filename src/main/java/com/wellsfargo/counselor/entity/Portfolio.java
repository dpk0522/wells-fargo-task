package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolio_id;

    @Column
    private float total_value;

    @Column
    private Date last_updated;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securityList = new ArrayList<>();

    public Portfolio(float total_value, Date last_updated) {
        this.total_value = total_value;
        this.last_updated = last_updated;
    }

    public float getTotal_value() {
        return total_value;
    }

    public void setTotal_value(float total_value) {
        this.total_value = total_value;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }
}

