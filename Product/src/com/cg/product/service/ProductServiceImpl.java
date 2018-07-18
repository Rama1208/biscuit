package com.cg.product.service;

import java.util.List;

import com.cg.product.dao.IProductDao;
import com.cg.product.dao.ProductDaoImpl;
import com.cg.product.dto.Product;

public class ProductServiceImpl implements IProductService {
	
	IProductDao dao=new  ProductDaoImpl();

	@Override
	public void addProduct(Product product) {
	dao.addProductDao(product);
		
	}

	@Override
	public List<Product> showProduct() {
		return dao.showProduct();
	}

	@Override
	public Product searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public void removeProduct(int rid) {
		dao.removeProduct(rid);
	}
	}

