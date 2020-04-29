package com.xyz.spring.raul.model.services;

import java.util.Set;

import com.xyz.spring.raul.model.Pet;

public interface PetService {

	public Pet findById(Long id);
	
	public Pet save(Pet pet);
	
	public Set<Pet> findAll();
	
}
