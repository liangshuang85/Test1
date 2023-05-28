package com.example1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="customer")


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "jobNo",nullable = false)
    private String jobNo;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "department",nullable = false)
    private String department;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", jobNo='" + jobNo + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
