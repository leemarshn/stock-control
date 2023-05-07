package com.lenhac.stockcontrol.repositories;

import com.lenhac.stockcontrol.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
