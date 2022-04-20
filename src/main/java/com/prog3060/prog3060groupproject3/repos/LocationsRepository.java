package com.prog3060.prog3060groupproject3.repos;

import com.prog3060.prog3060groupproject3.model.Departments;
import com.prog3060.prog3060groupproject3.model.Locations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationsRepository extends CrudRepository<Locations, Long> {

    @Query(value = "SELECT country_id, COUNT(city) FROM Locations group by country_id", nativeQuery = true)
    List<String> countByCountryId();
    List<Locations> findAllById(Long locationId);


}
