package com.prog3060.prog3060groupproject3.repos;

import com.prog3060.prog3060groupproject3.model.Jobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsRepository extends CrudRepository<Jobs, Long> {

    List<Jobs> findAllById(Long jobId);
    List<Jobs> findDistinctByJobTitleContaining(String job_title);



}
