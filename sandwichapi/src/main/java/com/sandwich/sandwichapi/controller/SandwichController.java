package com.sandwich.sandwichapi.controller;

import com.sandwich.sandwichapi.dto.*;
import com.sandwich.sandwichapi.entity.*;
import com.sandwich.sandwichapi.repository.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sandwiches")
public class SandwichController {
  @Autowired
  private SandwichRepository sandwichRepository;

  @GetMapping
  public List<Sandwich> getAllSandwwiches() {
    return sandwichRepository.findAll();
  }

  @PostMapping
  public Sandwich createSandwich(@RequestBody Sandwich sandwich) {
    // print all the params
    // Find the parameter named ingredientIds
    // Find all the ingredients
    // Sanwhich.new(params)
    //  Set on the model
    System.out.println("TEST TEST TEST");
    System.out.println("Sandwich" + sandwich);
    return sandwichRepository.save(sandwich);
  }

  // @PostMapping
  // public ResponseEntity<Sandwich> createSandwich(@RequestBody SandwichDTO sandwichDTO) {
  //   Sandwich sandwich = new Sandwich();
  //   sandwich.setName(sandwichDTO.getName());

  //   // Convert list of IDs to Set of Ingredient objects
  //   Set<Ingredient> ingredients = sandwichDTO.getIngredientIds().stream()
  //       .map(id -> ingredientRepository.findById(id)
  //           .orElseThrow(() -> new RuntimeException("Ingredient not found: " + id)))
  //       .collect(Collectors.toSet());

  //   sandwich.setIngredients(ingredients);
  //   return ResponseEntity.ok(sandwichRepository.save(sandwich));
  // }

  @GetMapping("/{id}")
  public Sandwich getSanwichById(@PathVariable Long id) {
    return sandwichRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Sanwich not found"));
  }

  // @GetMapping("/type/{type}")
  // public List<Sandwich> getSandwichesByType(@PathVariable String type) {
  //   return sandwichRepository.findAll().stream()
  //       .filter(sandwich -> sandwich.getType().equalsIgnoreCase(type))
  //       .toList();
  // }
}