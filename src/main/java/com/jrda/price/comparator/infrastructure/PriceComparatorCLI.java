package com.jrda.price.comparator.infrastructure;

import java.util.Scanner;

import com.jrda.price.comparator.application.AddProduct;
import com.jrda.price.comparator.application.DisplayProducts;

public class PriceComparatorCLI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cont = 0;
		do {
			Double price = getDouble(in, "price");
			Double quantity = getDouble(in, "quantity");
			
			AddProduct addProduct = new AddProduct();
			addProduct.addProduct(price, quantity);
			DisplayProducts displayProducts = new DisplayProducts();
			System.out.println(displayProducts.getProducts());
			
			System.out.println("Insert 1 to add product, 0 to exit.");
			cont = in.nextInt();
		} while(cont == 1);
		
		in.close();
	}
	
	public static double getDouble(Scanner in, String propertyName) {
		System.out.println("Insert " + propertyName);
		if (in.hasNextDouble())
			return in.nextDouble();
		else {
			System.out.println("Please insert a valid number.");
			in.nextLine();
			return getDouble(in, propertyName);
		}
	}
}
