package com.sandwich.sandwichapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.util.HashSet;

@Entity
@Data
public class Sandwich {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  @ManyToMany
  @JoinTable(name = "sandwich_ingredients", joinColumns = @JoinColumn(name = "sandwich_id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
  private Set<Ingredient> ingredients = new HashSet<>();
}