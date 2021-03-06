package com.prog3060.prog3060groupproject3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departments {

    @Id
    @GeneratedValue
    @Column(name = "department_id", nullable = false)
    private Long id;
    @Column(name = "department_name", nullable = false)
    private String name;
    private Long locationId;

    public Departments() {

    }

    public Departments(String name, Long locationId) {
        this.name = name;
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
