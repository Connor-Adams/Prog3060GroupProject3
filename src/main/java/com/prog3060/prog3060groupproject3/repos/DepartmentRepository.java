package com.prog3060.prog3060groupproject3.repos;

import com.prog3060.prog3060groupproject3.model.Departments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Departments,Long> {

    List<Departments> findByLocationId(Long locationId);
}
