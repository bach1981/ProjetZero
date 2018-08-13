package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}


	/* ajout d'une condition if et else pour que la quantité ne soit négative*/
	public void setQuantity(int quantity) {
		if (quantity < 0) {

			quantity = 0;

		}
		else

			this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	/* ajout d'une condition if/else if /else pour que le prix ne soit ni négatif ou supérieur à 1000*/
	public void setPrice(double price) {
		if (price < 0) {

			price = 0;

		} else if (price > 1000) {

			price = 1000;

		}
		else this.price = price;
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		return price * quantity; /* rajouter la total en multipliant la quantité par le prix*/
	}
}
