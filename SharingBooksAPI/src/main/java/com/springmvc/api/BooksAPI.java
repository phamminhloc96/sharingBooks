package com.springmvc.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Book;

@RestController
public class BooksAPI {

	@RequestMapping(value = "api/book", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Book createNewBook() {
		Book books = 
			new Book("b01", "Sherlock Holmes", "Sir Conan Doyle", "Detective novel", 300.000);
		return books;
	}
	
	@RequestMapping(value = "api/book", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public Book updateBook() {
		Book books = 
			new Book("b01", "Sherlock Holmes", "Sir Conan Doyle", "Detective novel", 300.000);
		return books;
	}
	
	@RequestMapping(value = "api/book", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteBook() {
		//...
	}
	
}
