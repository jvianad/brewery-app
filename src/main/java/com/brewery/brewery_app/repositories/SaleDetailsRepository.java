package com.brewery.brewery_app.repositories;

import com.brewery.brewery_app.entities.SaleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDetailsRepository extends JpaRepository<SaleDetails,Long> {
}
