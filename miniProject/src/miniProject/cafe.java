package miniProject;

public class cafe {

	 String ItemName;
	double price;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void info() {
		System.out.println(ItemName + "\t" + price);
	}

}
