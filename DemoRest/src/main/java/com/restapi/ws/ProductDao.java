package com.restapi.ws;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	private static List<Product> data = new ArrayList<>();

	static {
		data.add(new Product(1, "iphone", 999));
		data.add(new Product(2, "Blackberry", 888));
	}

	private ProductDao() {
	}

	private static ProductDao instance;

	public static ProductDao getInstance() {
		if (instance == null) {
			instance = new ProductDao();
		}
		return instance;
	}

	// Get all data
	public List<Product> listAll() {
		return new ArrayList<Product>(data);
	}

	// add new data
	public int add(Product product) {
		int newId = data.size() + 1;
		product.setId(newId);
		data.add(product);

		return newId;
	}

	// get/retrive specific data
	public Product get(int id) {
		Product productToFind = new Product(id);
		int index = data.indexOf(productToFind);

		if (index >= 0) {
			return data.get(index);
		}
		return null;
	}

	// update specific dataset
	public boolean update(Product product) {
		int index = data.indexOf(product);

		if (index >= 0) {
			data.set(index, product);
			return true;
		}
		return false;
	}

	// delete specific dataset
	public boolean delete(int id) {
		Product productToFind = new Product(id);
		int index = data.indexOf(productToFind);

		if (index >= 0) {
			data.remove(index);
			return true;
		}
		return false;
	}

}
