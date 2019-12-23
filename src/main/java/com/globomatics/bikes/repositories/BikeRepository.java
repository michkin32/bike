package com.globomatics.bikes.repositories;

import com.globomatics.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
