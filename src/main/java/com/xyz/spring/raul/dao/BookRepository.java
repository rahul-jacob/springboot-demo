package com.xyz.spring.raul.dao;

import org.springframework.data.repository.CrudRepository;

import com.xyz.spring.raul.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
