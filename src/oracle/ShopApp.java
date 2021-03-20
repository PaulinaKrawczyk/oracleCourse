package oracle;

public class ShopApp {
	public static void main(String[] args) {
		double tax = 0.2;
		double total = 0;

		System.out.println("Welcome to Duck Choice Shop");
		Customer c1 = new Customer("Picky", 3);
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
		Clothing item3 = new Clothing("Green Scarf", 5, "S");

		Clothing[] items = {item1, item2, item3, new Clothing("Blue T-Shirt", 10.5, "S")};

		c1.addItems(items);

		System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

		for (Clothing item : c1.getItems()) {
			System.out.println("Items: " + item.getDescription());
		}

	}
}