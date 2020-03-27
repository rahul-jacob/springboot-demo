package com.xyz.spring.raul.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.xyz.spring.raul.dao.AuthorRepository;
import com.xyz.spring.raul.dao.BookRepository;
import com.xyz.spring.raul.domain.Author;
import com.xyz.spring.raul.domain.Book;

@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Author author = new Author("Eric","Evans");
		Book book = new Book("Domain Driven Design","1233");
		author.getBooks().add(book);
		book.getAuthors().add(author);
		
		authorRepository.save(author);
		bookRepository.save(book);
		
		
		Author authorOne = new Author("Rod","Johnson");
		Book bookOne = new Book("J2EE Development without EJB","7899");
		authorOne.getBooks().add(bookOne);
		bookOne.getAuthors().add(authorOne);
		
		authorRepository.save(authorOne);
		bookRepository.save(bookOne);
		
		System.out.println("Started In Bootstrap run method");
		System.out.println("Number of Books "+bookRepository.count());
		
	}

}
