package ustbatchno3.junit5testcases;

public class Garmentdress {
	private int count,price;
	private String garment;
	public Garmentdress(int count, int price, String garment) {
		super();
		this.count = count;
		this.price = price;
		this.garment = garment;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGarment() {
		return garment;
	}
	public void setGarment(String garment) {
		this.garment = garment;
	}
	@Override
	public String toString() {
		return "count=" + count + "\nprice=" + price + "\ngarment=" + garment + "\n\n";
	}
	
	
}
