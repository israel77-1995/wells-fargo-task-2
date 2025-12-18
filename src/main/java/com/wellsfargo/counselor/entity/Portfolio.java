package com.wellsfargo.counselor.entity;
import  jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;

import java.util.Set;


import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToMany
    @JoinTable(name = "portfolio_security")
    private Set<Security> securities;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {}

    public Portfolio(String name, Date creationDate, Client client){
        this.name = name;
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public Client getClient() {
        return client;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }

    public void setClient(Client client) {
        this.client = client;
    }














}
