package com.prog3060.prog3060groupproject3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DepartmentsEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long locationId;

    public DepartmentsEntity() {

    }

    public DepartmentsEntity(String name, Long locationId) {
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
        return "DepartmentsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
