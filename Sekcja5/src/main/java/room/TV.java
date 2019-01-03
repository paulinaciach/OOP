package room;

public class TV {

	
	private String brand;
	private String type;
	private int size;
	
	public TV(String brand, String type, int size) {
		super();
		this.brand = brand;
		this.type = type;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

	public void turnON() {

		System.out.println("********");
		System.out.println("Welcome!");
		System.out.println(brand);
		System.out.println("********");

	}
	
	
	
	
	
	
	
	
}
