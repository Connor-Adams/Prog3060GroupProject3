package com.prog3060.prog3060groupproject3.repos;

import com.prog3060.prog3060groupproject3.model.Departments;
import com.prog3060.prog3060groupproject3.model.Locations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationsRepository extends CrudRepository<Locations, Long> {

}
