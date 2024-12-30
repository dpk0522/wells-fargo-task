package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long client_id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone_number;

    @Column
    private String adress;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }



    public Client(long client_id, String name, String email, String phone_number, String adress, Advisor advisor) {
        this.client_id = client_id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.adress = adress;
        this.advisor = advisor;
    }
}
