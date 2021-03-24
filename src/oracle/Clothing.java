package oracle;

public class Clothing implements Comparable<Clothing> {
	public final static double MIN_PRICE = 10.0;
	public final static double MIN_TAX = 0.2;
	private String description;
	private double price;
	private String size = "M";

	public Clothing(String description, double price, String aSize) {
		this.description = description;
		this.price = price;
		size = aSize;
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
//		this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return getDescription() + ", " + getSize() + ", " + getPrice();
	}

	@Override
	public int compareTo(Clothing c) {
		return this.description.compareTo(c.description);
	}
}
