package sort.javaapi.usertype.comparable;

public class Fruit implements Comparable<Fruit> {

	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return name +  ":" + price;
		
	}

	@Override
	public int compareTo(Fruit o) {
		
		return Integer.compare(this.price, o.price);
	
	}
}