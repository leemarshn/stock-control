package com.lenhac.stockcontrol.repositories;

import com.lenhac.stockcontrol.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
