package com.example.Question4.Domain;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private long phone;

    public Department() {
    }

    public Department(Long department_id, String name, long phone) {
        this.department_id = department_id;
        this.name = name;
        this.phone = phone;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
