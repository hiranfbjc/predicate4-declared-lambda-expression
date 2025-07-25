package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}