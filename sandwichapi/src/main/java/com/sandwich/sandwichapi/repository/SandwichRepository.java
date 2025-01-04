package com.sandwich.sandwichapi.repository;

import com.sandwich.sandwichapi.entity.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}