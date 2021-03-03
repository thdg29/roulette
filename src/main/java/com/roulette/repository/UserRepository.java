package com.roulette.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.roulette.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
