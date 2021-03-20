package oracle;

public class Clothing {
	private final double MIN_PRICE = 10.0;
	private final double MIN_TAX = 0.2;
	private String description;
	private double price;
	private String size = "M";

	public Clothing(String description, double price, String size) {
		this.description = description;
		this.price = price;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price + price * MIN_TAX;
	}

	public void setPrice(double price) {
		this.price = Math.max(price, MIN_PRICE);
//		this.price=  (price > MIN_PRICE) ? price : MIN_PRICE;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
