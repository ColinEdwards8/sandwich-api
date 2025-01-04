
package com.sandwich.sandwichapi.dto;

import lombok.Data;
import java.util.List;

@Data
public class SandwichDTO {
  private String name;
  private List<Long> ingredientIds; // Just the IDs, not the full Ingredient objects
}