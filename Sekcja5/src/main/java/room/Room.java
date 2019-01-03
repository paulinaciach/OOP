package room;

public class Room {

	
	private int size;
	private int windows;
	private TV tv;
	private Couch couch;
	
	
	public Room(int size, int windows, TV tv, Couch couch) {
		super();
		this.size = size;
		this.windows = windows;
		this.tv = tv;
		this.couch = couch;
	}
	
	public void roomSize() {
		System.out.println("This room is: "+this.size+"m2 and has: "+this.windows+" windows.");
		
		System.out.println("This room has TV: "+this.tv.getBrand()+" and has: "+this.couch.getCouch());
		
	}
	
	
	public void turnOnTV() {
		
		System.out.println("Turning on TV");
		tv.turnON();
		
	}
	
	
	public int getSize() {
		return size;
	}
	public int getWindows() {
		return windows;
	}
	public TV getTv() {
		return tv;
	}
	public Couch getCouch() {
		return couch;
	}
	
	
	
	
	
	
	
	
}
