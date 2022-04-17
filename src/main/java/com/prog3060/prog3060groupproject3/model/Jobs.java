package com.prog3060.prog3060groupproject3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jobs {
    @Id
    @GeneratedValue
    @Column(name = "job_id", nullable = false)
    private Long id;
    private String jobTitle;
    private double minSalary;
    private double maxSalary;

    public Jobs() {

    }

    public Jobs(String jobtitle, double minSalary, double maxSalary) {
        this.jobTitle = jobtitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public String getJobtitle() {
        return jobTitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobTitle = jobtitle;
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
                ", jobtitle='" + jobTitle + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
