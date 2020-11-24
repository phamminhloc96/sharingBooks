package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.api.BooksAPI;
import com.springmvc.model.Book;

@Controller
public class BooksController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	protected ModelAndView index() {
		BooksAPI api = new BooksAPI();
		Book book = api.createNewBook();
		ModelAndView mav = new ModelAndView("index", "books", book);
		return mav;
	}
	
}
