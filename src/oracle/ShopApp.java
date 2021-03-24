package oracle;

import java.util.Arrays;

public class ShopApp {
	public static void main(String[] args) {

		System.out.println("Welcome to Duck Choice Shop");
		System.out.println("minimum price = " + Clothing.MIN_PRICE + " Tax = " + Clothing.MIN_TAX);
		Customer c1 = new Customer("Picky", 3);
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
		Clothing item3 = new Clothing("Green Scarf", 5, "S");
		Clothing[] items = {item1, item2, item3, new Clothing("Blue T-Shirt", 10.5, "S")};

		c1.addItems(items);

		System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
		for (Clothing item : c1.getItems()) {
			System.out.println("Items: " + item);
		}

		int average = 0;
		int count = 0;
		for (Clothing item : c1.getItems()) {
			if (item.getSize().equals("L")) {
				count++;
				average += item.getPrice();
			}
		}

//		try {
//			average = average / count;
//			System.out.println("Average price " + average + ", Count " + count);
//		} catch (ArithmeticException e) {
//			System.out.println("Don't divide by zero");
//		}

		average = (count == 0) ? 0 : average / count;
		System.out.println("Average price " + average + ", Count " + count);

		Arrays.sort(c1.getItems());

		for (Clothing item : c1.getItems()) {
			System.out.println("Items: " + item);
		}
	}
}