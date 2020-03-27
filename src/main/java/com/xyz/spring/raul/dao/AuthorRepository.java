package com.xyz.spring.raul.dao;

import org.springframework.data.repository.CrudRepository;

import com.xyz.spring.raul.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
