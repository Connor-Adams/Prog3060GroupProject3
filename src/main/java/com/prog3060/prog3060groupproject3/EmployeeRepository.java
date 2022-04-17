package com.prog3060.prog3060groupproject3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

    List<Employees> findByManagerId(Long id);
    List<Employees> findByFirstNameEndingWith(String letter);
}
