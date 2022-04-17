package com.prog3060.prog3060groupproject3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class JobHistoryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Date startDate;
    private Date endDate;
    private Long jobId;
    private Long departmentId;

    public JobHistoryEntity() {

    }

    public JobHistoryEntity(Date startDate, Date endDate, Long jobId, Long departmentId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobId = jobId;
        this.departmentId = departmentId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "JobHistoryEntity{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", jobId=" + jobId +
                ", departmentId=" + departmentId +
                '}';
    }
}
