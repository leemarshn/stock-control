package com.lenhac.stockcontrol.repositories;


import com.lenhac.stockcontrol.model.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<MainCategory, Long> {
}
