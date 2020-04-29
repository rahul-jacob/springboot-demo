package com.xyz.spring.raul.model.services;

import java.util.Set;

import com.xyz.spring.raul.model.Owner;

public interface OwnerService {
	
	public Owner findById(Long id);
	
	public Owner findByLastName(String lastName);
	
	public Owner save(Owner owner);
	
	public Set<Owner> findAll();
}
