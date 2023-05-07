package com.lenhac.stockcontrol.repositories;

import com.lenhac.stockcontrol.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
