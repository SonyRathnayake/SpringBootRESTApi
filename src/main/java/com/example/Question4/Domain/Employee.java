package com.example.Question4.Domain;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employee_id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    int department;

    public Employee() {
        super();
    }

    public Employee(Long id, String name, int dept) {
        super();
        this.employee_id = id;
        this.name = name;
        this.department = dept;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int dept) {
        this.department = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ']';
    }

}
