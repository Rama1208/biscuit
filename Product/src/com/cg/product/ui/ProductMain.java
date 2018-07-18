package com.cg.product.ui;

import java.util.List;
import java.util.Scanner;
import com.cg.product.dto.Product;
import com.cg.product.service.IProductService;
import com.cg.product.service.ProductServiceImpl;

public class ProductMain {
	
public static void main(String[] args) {
	
		
		Scanner scanner=new Scanner(System.in);
		IProductService service=new ProductServiceImpl();
		
		int choice=0;
		do {
			printDetails();
			System.out.println("enter your choice");
			choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter product id:");
			int pid=scanner.nextInt();
			System.out.println("enter product name:");
			String pname=scanner.next();
			System.out.println("enter product price:");
			double pprice=scanner.nextDouble();
			
			Product product=new Product();
			product.setProdId(pid);
			product.setProdName(pname);
			product.setProdPrice(pprice);
			
			service.addProduct(product);
			
		case 2:
			List<Product>allData=service.showProduct();
			for(Product all:allData) {
				System.out.println("product id:"+all.getProdId());
				System.out.println("product name:"+all.getProdName());
				System.out.println("product price"+all.getProdPrice());
				
			}
			break;
			
			
		case 3:
			System.out.println("enter product id");
			int id=scanner.nextInt();
			Product productsearch=service.searchProduct(id);
			if(productsearch.getProdId()==0) {
				System.out.println("product not found");
				
			}else {
				System.out.println("product name"+productsearch.getProdName());
				System.out.println("product id"+productsearch.getProdId());
				System.out.println("product price"+productsearch.getProdPrice());
			}
			break;
			
			
		case 4:
			System.out.println("enter product id");
			int rid=scanner.nextInt();
			service.removeProduct(rid);
			break;
			
			
		case 5:
			System.exit(0);
			break;
		default:
			break;
			
			
	}
	}while(choice!=6);

	}
	public static void printDetails() {

	System.out.println("1.add product");
	System.out.println("2.show product");
	System.out.println("3.search product");
	System.out.println("4.remove product");
	System.out.println("5.exit");
	
}
}