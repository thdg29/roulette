package com.roulette.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.roulette.entity.Roulette;

public interface RouletteRepository extends JpaRepository<Roulette, Long> {

}
