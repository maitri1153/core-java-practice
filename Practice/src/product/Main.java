package product;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Pen", 20, 2));
		products.add(new Product(2, "Pencil", 50, 3));
		products.add(new Product(3, "Project Paper", 6, 10));
		products.add(new Product(4, "Shapner", 5, 5));
		products.add(new Product(5, "Colour Pen", 10, 12));
		products.add(new Product(6, "Marker Pen", 20, 15));
		products.add(new Product(7, "Plastic Colour", 14, 20));
		products.add(new Product(8, "Diary", 17, 25));

		Sale sale = new Sale();
		sale.sellProduct(products);

		Purchase purchase = new Purchase();
		purchase.PurchaseProduct(products);
	}
}