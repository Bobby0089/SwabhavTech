package com.company.Ecommerce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductManagementSystem {

	public static void main(String[] args) {
		//Using Scanner class for user input
		Scanner sc = new Scanner(System.in);
		int numberOfProducts = getPositiveNumber(sc);
		
		Product[] product = new Product[numberOfProducts];
		
		for(int i = 0; i < numberOfProducts; i++)
		{
			int productId = getUniqueid(sc,product,i);
			String productName = getName(sc,i);
			String category = getCategory(sc,i);
			double productPrice = getPositiveDouble(sc,i);
			double productRating = getPositiveRating(sc,i);
			
			Product p = new Product(productId,productName,category,productPrice,productRating);
			product[i] = p;
			System.out.println("Product added Successfully..");
		}
		
		start(sc,product);
		
		sc.close();
	}
	private static int getPositiveNumber(Scanner sc)
	{
		int positiveNumber;
		while(true)
		{
			System.out.println("Enter Number of Products to add : ");
			positiveNumber = sc.nextInt();
			sc.nextLine();
			
			if(positiveNumber > 0)
			{
				return positiveNumber;
			}	
			System.out.println("Enter a positive number....");
		}
		
	}
	
	private static int getUniqueid(Scanner sc,Product[] product, int idx )
	{
		int id;
		while(true)
		{
			System.out.println("Enter a positive and unique product id for product "+(idx+1)+" : ");
			id = sc.nextInt();
			sc.nextLine();
			
			boolean check = false;
			
			for(int j = 0; j < idx; j++)
			{
				if(product[j].getProductId() == id)
				{
					check = true;
					break;
				}
			}
			
			if(!check && id > 0) return id;
			
			System.out.println("Enter a unique or positive product id.  Try again.");
		}
		
	}

	private static String getName(Scanner sc, int i) {
		String name;
		System.out.println("Enter name of product "+(i+1)+" : ");
		name = sc.nextLine();
		return name;
	}
	
	private static String getCategory(Scanner sc, int i) {
		String category;
		System.out.println("Enter category of product "+(i+1)+" : ");
		category = sc.nextLine();
		return category;
	}
	
	private static double getPositiveDouble(Scanner sc, int i) 
	{
		double positiveDouble;
		while(true)
		{
			System.out.println("Enter price for product "+(i+1)+" : ");
			positiveDouble = sc.nextDouble();
			sc.nextLine();
			
			if(positiveDouble > 0)
			{
				return positiveDouble;
			}	
			System.out.println("Enter a positive number..  Try again");
		}
		
	}
	
	private static double getPositiveRating(Scanner sc, int i) 
	{
		double positiveDouble;
		while(true)
		{
			System.out.println("Enter a rating for product "+(i+1)+" : ");
			positiveDouble = sc.nextDouble();
			sc.nextLine();
			
			if(positiveDouble > 0 && positiveDouble <= 5)
			{
				return positiveDouble;
			}	
			System.out.println("Enter a positive number..  Try again");
		}
		
	}
	
	private static void displayMenu()
	{
		System.out.println("What do you want to do. ");
		System.out.println("1. Filter all products whose price is greater than 5000.");
		System.out.println("2. Sort products by rating in descending order.");
		System.out.println("3. Group products by category and display them.");
		System.out.println("4. Find the most expensive product.");
		System.out.println("5. Calculate the average price of all products.");
		System.out.println("6. Convert all product names to uppercase using streams.");
		System.out.println("7. Find the total number of products in each category.");
		System.out.println("8. Exit");
		System.out.println("Enter your choice : ");
	}
	
	private static void start(Scanner sc,Product[] product)
	{
		List<Product> products = Arrays.asList(product);
		int choice;
		while(true)
		{
			System.out.println();
			displayMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1 : List<Product> filteredProducts = products.stream().filter(p -> p.getPrice() > 5000).collect(Collectors.toList());
	                 System.out.println("Filtered Products: " + filteredProducts);
	                 break;
	        
			case 2 :  System.out.println("\nProducts sorted by rating (high to low):");
	                  products.stream().sorted(Comparator.comparingDouble(Product::getRating).reversed()).forEach(System.out::println);
	                  break;
	                  
			case 3 :System.out.println("\nProducts grouped by category:");
	                Map<String, List<Product>> productsByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory));
	                productsByCategory.forEach((category, productList) ->
	                {
	                	System.out.println(category + ": " + productList);
	                });
	                break;
	                
			case 4 : Optional<Product> mostExpensiveProduct = products.stream().max(Comparator.comparingDouble(p -> p.getPrice()));
	        		 System.out.println("\n\nMost Expensive Product: " + mostExpensiveProduct.orElse(null));
	        		 break;
	        		 
			case 5 : double avgPrice = products.stream().mapToDouble(p -> p.getPrice()).average().orElse(0.0);
					 System.out.println("\n\nAverage Price: " + avgPrice);
					 break;
					 
			case 6 : List<String> uppercaseNames = products.stream().map(i -> i.getName().toUpperCase()).collect(Collectors.toList());
					 System.out.println("\n\nProducts with Uppercase Names: " + uppercaseNames);
					 break;
					 
			case 7 : System.out.println("\nTotal number of products per category:");
					 Map<String, Long> productCountByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
					 productCountByCategory.forEach((category, count) -> 
					 {
						 System.out.println(category + ": " + count);
					 });
					 break;
			case 8 : System.out.println("Exting....");
					 return;
			
			default : System.out.println("Invalid input try again.");
			}
		}
	}

}
