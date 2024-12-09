package com.sandwich.sandwichapi.controller;

import com.sandwich.sandwichapi.entity.Ingredient;
import com.sandwich.sandwichapi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {
    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @GetMapping("/{id}")
    public Ingredient getIngredientById(@PathVariable Long id) {
        return ingredientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Ingredient not found"));
    }

    @GetMapping("/type/{type}")
    public List<Ingredient> getIngredientsByType(@PathVariable String type) {
        return ingredientRepository.findAll().stream()
            .filter(ingredient -> ingredient.getType().equalsIgnoreCase(type))
            .toList();
    }
}