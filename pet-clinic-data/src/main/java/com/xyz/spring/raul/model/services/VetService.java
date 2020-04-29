package com.xyz.spring.raul.model.services;

import java.util.Set;

import com.xyz.spring.raul.model.Vet;

public interface VetService {
	
	public Vet findById(Long id);
	
	public Vet save(Vet vet);
	
	public Set<Vet> findAll();
}
