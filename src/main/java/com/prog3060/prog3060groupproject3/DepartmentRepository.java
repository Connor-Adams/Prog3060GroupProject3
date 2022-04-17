package com.prog3060.prog3060groupproject3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentsEntity,Long> {

    List<DepartmentsEntity> findByLocationId(Long locationId);
}
