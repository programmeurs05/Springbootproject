package com.Programmeurs.Empresa.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    private String email;


    @Transient
    private Enmu_RoleName enmu_RoleName;


    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Enterprise enterprise;

    @OneToMany
    @JoinColumn(name = "transactions" )
    private List<Transaction> transactions;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Employee() {
    }

    public Employee(long id, String email, Profile profile, Enmu_RoleName enmu_RoleName, Enterprise enterprise, List<Transaction> transactions, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.profile = profile;
        this.email = email;
        this.enmu_RoleName = enmu_RoleName;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enmu_RoleName getEnmu_RoleName() {
        return enmu_RoleName;
    }

    public void setEnmu_RoleName(Enmu_RoleName enmu_RoleName) {
        this.enmu_RoleName = enmu_RoleName;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

