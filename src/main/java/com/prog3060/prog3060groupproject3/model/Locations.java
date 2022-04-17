package com.prog3060.prog3060groupproject3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Locations {
    @Id
    @GeneratedValue
    @Column(name = "location_id", nullable = false)
    private Long id;
    private String address;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String countryId;

    public Locations() {

    }

    public Locations(String address, String postalCode, String city, String province, String countryId) {
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.stateProvince = province;
        this.countryId = countryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return stateProvince;
    }

    public void setProvince(String province) {
        this.stateProvince = province;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", province='" + stateProvince + '\'' +
                ", countryId='" + countryId + '\'' +
                '}';
    }
}
