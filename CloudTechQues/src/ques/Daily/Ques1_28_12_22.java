package ques.Daily;

import java.util.Arrays;
import java.util.List;

public class Ques1_28_12_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product(101, "Java", "Books", 150);
		Product p2 = new Product(102, "Spring", "Books", 300);
		Product p3 = new Product(103, "Hibernate", "Books", 400);
		Product p4 = new Product(104, "Css", "Books", 250);
		Product p5 = new Product(105, "Html", "Books", 155);

		Product p6 = new Product(106, "Nokia", "Phone", 2010);
		Product p7 = new Product(107, "Samsung", "Phone", 10000);
		Product p8 = new Product(108, "Lenovo", "Phone", 3620);

		List<Product> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

		list.stream().filter(p -> p.getCategory() == "Books" && p.getPrice() > 200).forEach(p -> System.out.println(p.toString()));

	}

}
