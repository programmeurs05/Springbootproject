package com.Programmeurs.Empresa.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String concept;
    private float amount;
    @ManyToOne
    @JoinColumn(name = "transactions_id")
    private Enterprise enterprise;


    @ManyToOne
    @JoinColumn(name = "transactions")
    private Employee employee;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    public Transaction() {
    }

    public Transaction(long id, String concept, float amount, Enterprise enterprise, Employee employee, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
        this.employee = employee;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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




}

