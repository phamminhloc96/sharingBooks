package com.springmvc.model;

public class Book {

	private String id;
	private String name;
	private String author;
	private String category;
	private double price;
	
	public Book() {
		super();
	}

	public Book(String id, String name, String author, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
