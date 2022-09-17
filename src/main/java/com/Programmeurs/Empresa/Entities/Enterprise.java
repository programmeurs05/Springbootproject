package com.Programmeurs.Empresa.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    @OneToMany
    @JoinColumn(name = "employees_id")
    private List<Employee> employees;
    @OneToMany
    @JoinColumn(name = "transactions_id")
    private List<Transaction> transactions;
    private LocalDate createdAt;
    private LocalDate updateAt;


    public Enterprise(){

    }

    public Enterprise(String name, String document, String phone, String address, List<Employee> employeeList, List<Transaction> transactions, LocalDate createdAt, LocalDate updateAt) {

        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.employees = employeeList;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedAt(LocalDate createdAt) {
    }

    public void setUpdateAt(LocalDate updateAt) {
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }
}