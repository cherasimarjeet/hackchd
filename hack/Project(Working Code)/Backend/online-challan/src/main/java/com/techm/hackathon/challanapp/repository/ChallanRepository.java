package com.techm.hackathon.challanapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techm.hackathon.challanapp.domain.Challan;
@Repository
public interface ChallanRepository  extends CrudRepository<Challan,Long>{

}
