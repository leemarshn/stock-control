package com.lenhac.stockcontrol.repositories;

import com.lenhac.stockcontrol.model.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepository extends JpaRepository<Value, Long> {
}
