package com.prog3060.prog3060groupproject3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jobs {
    @Id
    @GeneratedValue
    private Long id;
    private String jobtitle;
    private double minSalary;
    private double maxSalary;

    public Jobs() {

    }

    public Jobs(String jobtitle, double minSalary, double maxSalary) {
        this.jobtitle = jobtitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
