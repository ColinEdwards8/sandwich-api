package com.sandwich.sandwichapi.sando;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SandwichService {
	public List<Sandwich> getSandwich() {
		return List.of(
				new Sandwich(
						1L,
						"Club",
						"Bacon",
						"Lettuce"));
	}
}
