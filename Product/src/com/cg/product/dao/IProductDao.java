package com.cg.product.dao;

import java.util.List;

import com.cg.product.dto.Product;

public interface IProductDao {

	public List<Product> showProduct();
	public void addProductDao(Product product);
	public Product searchProduct(int id);
	public void removeProduct(int rid);

}
