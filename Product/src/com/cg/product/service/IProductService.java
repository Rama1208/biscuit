package com.cg.product.service;

import java.util.List;

import com.cg.product.dto.Product;

public interface IProductService {

	public void addProduct(Product product);

	public List<Product> showProduct();

	public Product searchProduct(int id);

	public void removeProduct(int rid);
	

}
