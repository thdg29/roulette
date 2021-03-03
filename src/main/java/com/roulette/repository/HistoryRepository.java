package com.roulette.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.roulette.entity.History;

public interface HistoryRepository extends JpaRepository<History, Long>{

}
