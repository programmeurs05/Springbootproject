package com.Programmeurs.Empresa.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String image;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Employee employee;

    private String phone;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Profile() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Profile(String id, String image, String phone, Employee employee, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.employee = employee;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
