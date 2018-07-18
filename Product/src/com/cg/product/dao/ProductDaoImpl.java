package com.cg.product.dao;

import java.util.LinkedList;
import java.util.List;
import com.cg.product.dto.Product;

public class ProductDaoImpl implements IProductDao {
	List<Product>myList=new LinkedList<>();

	@Override
	public List<Product> showProduct() {
		
	return myList;
	}

	@Override
	public void addProductDao(Product product) {
		myList.add(product);
		
	}

	@Override
	public Product searchProduct(int id) {
		Product psearch=null;
		for(Product product:myList) {
			if(product.getProdId()==id) {
				psearch=product;
				break;
			}
		}
		return psearch;
	}

	@Override
	public void removeProduct(int rid) {
	for(Product product:myList) {
		if(product.getProdId()==rid) {
			myList.remove(product);
			break;
		}
	}
	}

}
